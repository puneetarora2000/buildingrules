/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc4javatoolbox.step.parser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class URLFileCache implements UrlDownloadProgress
{
	private String[] content = null;
	private int cursor = -1;
	private long fileSize = 0;

	public URLFileCache()
	{

	}

	public void loadFile(URL url) throws IOException {
		loadFile(url.openStream());
	}

	public void loadFile(File file) throws IOException {
		loadFile(new BufferedReader(new FileReader(file)));
	}

	public void loadFile(InputStream inputStream) throws IOException {
		loadFile(new BufferedReader(new InputStreamReader(inputStream)));
	}

	private void loadFile(BufferedReader buff) throws IOException {
		fileSize = 0;
		ArrayList<String> lines = new ArrayList<String>();
		String nextLine;
		while ((nextLine = buff.readLine()) != null) {
			fileSize += nextLine.length() + 2;
			lines.add(nextLine);
		}
		this.content = lines.toArray(new String[0]);
		this.cursor = -1;
	}

	public void loadZipFile(File ifcZipFile) throws IOException, IllegalArgumentException
	{
		loadZipFile(new FileInputStream(ifcZipFile));
	}
	
	public void loadZipFile(InputStream inputStream) throws IOException, IllegalArgumentException
	{
		String[] charsets = {Charset.defaultCharset().name(), "UTF-8", "Cp850"};
		for (String charsetName : charsets)
		{
			try
			{
				Charset charset = Charset.forName(charsetName);
				loadZipFile(inputStream, charset);
				break;
			}
			catch(IllegalArgumentException e)
			{
				System.err.println("URLFileCache.loadZipFile(InputStream): Reading ZIP file with charset "+charsetName+" failed!");
				if("1.7".compareTo(System.getProperty("java.version")) > 0)
					throw e;
			}
		}
	}
	
	public void loadZipFile(InputStream inputStream, Charset charset) throws IOException, IllegalArgumentException
	{
		fileSize = 0;
		ZipInputStream zipInputStream;
		if("1.7".compareTo(System.getProperty("java.version")) > 0)
		{
			//before Java 7
			zipInputStream = new ZipInputStream(inputStream);
		}
		else
		{
			//since Java 7
			zipInputStream = new ZipInputStream(inputStream, charset);
		}
		
		ZipEntry ifcZipEntry;
		while ((ifcZipEntry = zipInputStream.getNextEntry()) != null) 
		{
			String filename = ifcZipEntry.getName().toUpperCase();
			if (filename.endsWith(".IFC"))
			{
				BufferedReader buff = new BufferedReader(new InputStreamReader(zipInputStream));
				ArrayList<String> lines = new ArrayList<String>();
				String nextLine;
				while ((nextLine = buff.readLine()) != null) 
				{
					fileSize += nextLine.length() + 2;
					lines.add(nextLine);
				}
				this.content = lines.toArray(new String[0]);
				this.cursor = -1;
				break;
			}
		}
	}

	@Override
	public long getDownloadedSize() 
	{
		return fileSize;
	}

	public void reset() {
		cursor = -1;
	}

	private void isValidLineNumber(int lineNumber)
			throws IllegalArgumentException
	{
		if (lineNumber < 0) throw new IllegalArgumentException(
				"Illegal line number: line number < 0");
		if (lineNumber > content.length - 1) throw new IllegalArgumentException(
				"Illegal line number: line number > line numbers of file content");
	}

	public void setNextLineNumber(int nextLineNumber)
			throws IllegalArgumentException
	{
		isValidLineNumber(nextLineNumber);
		cursor = nextLineNumber - 1;
	}

	public int getLineNumberCount() {
		return content == null ? 0 : content.length;
	}

	public String[] getAllLines() {
		return content;
	}

	public String getLine(int lineNumber) throws IllegalArgumentException {
		isValidLineNumber(lineNumber);
		return content[lineNumber];
	}

	public boolean hasNextLine() {
		if (content == null) return false;
		if (cursor + 2 > content.length) return false;
		return true;
	}

	public String nextLine() {
		if (!hasNextLine()) return null;
		cursor++;
		return content[cursor];
	}

	public BufferedReader getBufferedReader() {
		StringBuffer sb = new StringBuffer();
		if(content != null)
		{
			for (String s : content) 
			{
				sb.append(s + "\n");
			}
		}
		return new BufferedReader(new StringReader(sb.toString()));
	}
}
