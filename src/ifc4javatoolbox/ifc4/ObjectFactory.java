package ifc4javatoolbox.ifc4;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class ObjectFactory extends java.util.HashMap<String, ObjectFactory.ClassBuilder>
{	private static final long serialVersionUID = 1L;
	public static java.util.HashMap<String, ObjectFactory.ClassBuilder> FACTORY_MAP = new ObjectFactory();

	interface ClassBuilder
	{
		Object instance();
	}

	public static Object createInstance(String entityName)
	{
		return FACTORY_MAP.get(entityName).instance();
	}

	public ObjectFactory()
	{
		this.put("IFCMODULUSOFSUBGRADEREACTIONMEASURE", new IfcModulusOfSubgradeReactionMeasureBuilder());
		this.put("IFCARITHMETICOPERATORENUM", new IfcArithmeticOperatorEnumBuilder());
		this.put("IFCCONSTRUCTIONEQUIPMENTRESOURCETYPEENUM", new IfcConstructionEquipmentResourceTypeEnumBuilder());
		this.put("IFCPROJECTIONELEMENTTYPEENUM", new IfcProjectionElementTypeEnumBuilder());
		this.put("IFCWORKPLANTYPEENUM", new IfcWorkPlanTypeEnumBuilder());
		this.put("IFCCONDENSERTYPEENUM", new IfcCondenserTypeEnumBuilder());
		this.put("IFCPLATETYPEENUM", new IfcPlateTypeEnumBuilder());
		this.put("IFCELECTRICCHARGEMEASURE", new IfcElectricChargeMeasureBuilder());
		this.put("IFCMASSFLOWRATEMEASURE", new IfcMassFlowRateMeasureBuilder());
		this.put("IFCPOSITIVELENGTHMEASURE", new IfcPositiveLengthMeasureBuilder());
		this.put("IFCCURVEINTERPOLATIONENUM", new IfcCurveInterpolationEnumBuilder());
		this.put("IFCELEMENTCOMPOSITIONENUM", new IfcElementCompositionEnumBuilder());
		this.put("IFCJUNCTIONBOXTYPEENUM", new IfcJunctionBoxTypeEnumBuilder());
		this.put("IFCTHERMALRESISTANCEMEASURE", new IfcThermalResistanceMeasureBuilder());
		this.put("IFCSANITARYTERMINALTYPEENUM", new IfcSanitaryTerminalTypeEnumBuilder());
		this.put("IFCNORMALISEDRATIOMEASURE", new IfcNormalisedRatioMeasureBuilder());
		this.put("IFCVOIDINGFEATURETYPEENUM", new IfcVoidingFeatureTypeEnumBuilder());
		this.put("SCHEMANAME", new SchemaNameBuilder());
		this.put("IFCELECTRICTIMECONTROLTYPEENUM", new IfcElectricTimeControlTypeEnumBuilder());
		this.put("IFCPUMPTYPEENUM", new IfcPumpTypeEnumBuilder());
		this.put("IFCROTATIONALSTIFFNESSMEASURE", new IfcRotationalStiffnessMeasureBuilder());
		this.put("IFCENGINETYPEENUM", new IfcEngineTypeEnumBuilder());
		this.put("IFCTIMEMEASURE", new IfcTimeMeasureBuilder());
		this.put("IFCWINDOWTYPEPARTITIONINGENUM", new IfcWindowTypePartitioningEnumBuilder());
		this.put("IFCOBJECTIVEENUM", new IfcObjectiveEnumBuilder());
		this.put("IFCSPECULARROUGHNESS", new IfcSpecularRoughnessBuilder());
		this.put("IFCELECTRICCAPACITANCEMEASURE", new IfcElectricCapacitanceMeasureBuilder());
		this.put("IFCMAGNETICFLUXMEASURE", new IfcMagneticFluxMeasureBuilder());
		this.put("IFCSOLIDANGLEMEASURE", new IfcSolidAngleMeasureBuilder());
		this.put("IFCSIPREFIX", new IfcSIPrefixBuilder());
		this.put("IFCGLOBALORLOCALENUM", new IfcGlobalOrLocalEnumBuilder());
		this.put("IFCDAYINMONTHNUMBER", new IfcDayInMonthNumberBuilder());
		this.put("IFCPRESSUREMEASURE", new IfcPressureMeasureBuilder());
		this.put("IFCBSPLINECURVEFORM", new IfcBSplineCurveFormBuilder());
		this.put("IFCTEXT", new IfcTextBuilder());
		this.put("IFCCONTROLLERTYPEENUM", new IfcControllerTypeEnumBuilder());
		this.put("IFCTENDONANCHORTYPEENUM", new IfcTendonAnchorTypeEnumBuilder());
		this.put("IFCWINDOWTYPEENUM", new IfcWindowTypeEnumBuilder());
		this.put("IFCFONTVARIANT", new IfcFontVariantBuilder());
		this.put("IFCCHANGEACTIONENUM", new IfcChangeActionEnumBuilder());
		this.put("IFCCABLESEGMENTTYPEENUM", new IfcCableSegmentTypeEnumBuilder());
		this.put("IFCLUMINOUSFLUXMEASURE", new IfcLuminousFluxMeasureBuilder());
		this.put("IFCMASSDENSITYMEASURE", new IfcMassDensityMeasureBuilder());
		this.put("IFCDOORSTYLECONSTRUCTIONENUM", new IfcDoorStyleConstructionEnumBuilder());
		this.put("IFCLAMPTYPEENUM", new IfcLampTypeEnumBuilder());
		this.put("IFCREFLECTANCEMETHODENUM", new IfcReflectanceMethodEnumBuilder());
		this.put("IFCROLEENUM", new IfcRoleEnumBuilder());
		this.put("IFCAREADENSITYMEASURE", new IfcAreaDensityMeasureBuilder());
		this.put("IFCASSEMBLYPLACEENUM", new IfcAssemblyPlaceEnumBuilder());
		this.put("IFCELECTRICCURRENTMEASURE", new IfcElectricCurrentMeasureBuilder());
		this.put("IFCCABLEFITTINGTYPEENUM", new IfcCableFittingTypeEnumBuilder());
		this.put("IFCUNITARYCONTROLELEMENTTYPEENUM", new IfcUnitaryControlElementTypeEnumBuilder());
		this.put("IFCDATE", new IfcDateBuilder());
		this.put("IFCCARDINALPOINTREFERENCE", new IfcCardinalPointReferenceBuilder());
		this.put("IFCDATAORIGINENUM", new IfcDataOriginEnumBuilder());
		this.put("IFCSPECIFICHEATCAPACITYMEASURE", new IfcSpecificHeatCapacityMeasureBuilder());
		this.put("IFCDISCRETEACCESSORYTYPEENUM", new IfcDiscreteAccessoryTypeEnumBuilder());
		this.put("IFCDIRECTIONSENSEENUM", new IfcDirectionSenseEnumBuilder());
		this.put("IFCTEXTPATH", new IfcTextPathBuilder());
		this.put("IFCELECTRICFLOWSTORAGEDEVICETYPEENUM", new IfcElectricFlowStorageDeviceTypeEnumBuilder());
		this.put("IFCTORQUEMEASURE", new IfcTorqueMeasureBuilder());
		this.put("IFCOPENINGELEMENTTYPEENUM", new IfcOpeningElementTypeEnumBuilder());
		this.put("IFCWINDOWSTYLEOPERATIONENUM", new IfcWindowStyleOperationEnumBuilder());
		this.put("IFCANALYSISTHEORYTYPEENUM", new IfcAnalysisTheoryTypeEnumBuilder());
		this.put("IFCTRANSFORMERTYPEENUM", new IfcTransformerTypeEnumBuilder());
		this.put("IFCFLOWINSTRUMENTTYPEENUM", new IfcFlowInstrumentTypeEnumBuilder());
		this.put("IFCSUBCONTRACTRESOURCETYPEENUM", new IfcSubContractResourceTypeEnumBuilder());
		this.put("IFCKINEMATICVISCOSITYMEASURE", new IfcKinematicViscosityMeasureBuilder());
		this.put("IFCELECTRICDISTRIBUTIONBOARDTYPEENUM", new IfcElectricDistributionBoardTypeEnumBuilder());
		this.put("IFCSURFACEFEATURETYPEENUM", new IfcSurfaceFeatureTypeEnumBuilder());
		this.put("IFCMECHANICALFASTENERTYPEENUM", new IfcMechanicalFastenerTypeEnumBuilder());
		this.put("IFCRAMPFLIGHTTYPEENUM", new IfcRampFlightTypeEnumBuilder());
		this.put("IFCSPECULAREXPONENT", new IfcSpecularExponentBuilder());
		this.put("IFCUNITENUM", new IfcUnitEnumBuilder());
		this.put("IFCELECTRICRESISTANCEMEASURE", new IfcElectricResistanceMeasureBuilder());
		this.put("IFCTHERMALCONDUCTIVITYMEASURE", new IfcThermalConductivityMeasureBuilder());
		this.put("IFCELECTRICMOTORTYPEENUM", new IfcElectricMotorTypeEnumBuilder());
		this.put("IFCTHERMODYNAMICTEMPERATUREMEASURE", new IfcThermodynamicTemperatureMeasureBuilder());
		this.put("IFCDOORPANELOPERATIONENUM", new IfcDoorPanelOperationEnumBuilder());
		this.put("IFCFONTSTYLE", new IfcFontStyleBuilder());
		this.put("IFCMOMENTOFINERTIAMEASURE", new IfcMomentOfInertiaMeasureBuilder());
		this.put("IFCWARPINGMOMENTMEASURE", new IfcWarpingMomentMeasureBuilder());
		this.put("IFCSOUNDPOWERLEVELMEASURE", new IfcSoundPowerLevelMeasureBuilder());
		this.put("IFCCOUNTMEASURE", new IfcCountMeasureBuilder());
		this.put("IFCIONCONCENTRATIONMEASURE", new IfcIonConcentrationMeasureBuilder());
		this.put("IFCELECTRICCONDUCTANCEMEASURE", new IfcElectricConductanceMeasureBuilder());
		this.put("IFCPLANEANGLEMEASURE", new IfcPlaneAngleMeasureBuilder());
		this.put("IFCFIRESUPPRESSIONTERMINALTYPEENUM", new IfcFireSuppressionTerminalTypeEnumBuilder());
		this.put("IFCMONTHINYEARNUMBER", new IfcMonthInYearNumberBuilder());
		this.put("IFCFASTENERTYPEENUM", new IfcFastenerTypeEnumBuilder());
		this.put("IFCBOOLEANOPERATOR", new IfcBooleanOperatorBuilder());
		this.put("IFCDOORTYPEOPERATIONENUM", new IfcDoorTypeOperationEnumBuilder());
		this.put("IFCANGULARVELOCITYMEASURE", new IfcAngularVelocityMeasureBuilder());
		this.put("IFCDATETIME", new IfcDateTimeBuilder());
		this.put("IFCLOGICALOPERATORENUM", new IfcLogicalOperatorEnumBuilder());
		this.put("IFCTASKTYPEENUM", new IfcTaskTypeEnumBuilder());
		this.put("IFCSTAIRTYPEENUM", new IfcStairTypeEnumBuilder());
		this.put("IFCLINEARVELOCITYMEASURE", new IfcLinearVelocityMeasureBuilder());
		this.put("IFCCOOLEDBEAMTYPEENUM", new IfcCooledBeamTypeEnumBuilder());
		this.put("IFCDESCRIPTIVEMEASURE", new IfcDescriptiveMeasureBuilder());
		this.put("IFCELECTRICAPPLIANCETYPEENUM", new IfcElectricApplianceTypeEnumBuilder());
		this.put("IFCVOLUMEMEASURE", new IfcVolumeMeasureBuilder());
		this.put("IFCINTEGER", new IfcIntegerBuilder());
		this.put("IFCDUCTSEGMENTTYPEENUM", new IfcDuctSegmentTypeEnumBuilder());
		this.put("IFCLOADGROUPTYPEENUM", new IfcLoadGroupTypeEnumBuilder());
		this.put("IFCSPACETYPEENUM", new IfcSpaceTypeEnumBuilder());
		this.put("IFCCREWRESOURCETYPEENUM", new IfcCrewResourceTypeEnumBuilder());
		this.put("IFCSOUNDPOWERMEASURE", new IfcSoundPowerMeasureBuilder());
		this.put("IFCSHEARMODULUSMEASURE", new IfcShearModulusMeasureBuilder());
		this.put("IFCFOOTINGTYPEENUM", new IfcFootingTypeEnumBuilder());
		this.put("IFCSIMPLEPROPERTYTEMPLATETYPEENUM", new IfcSimplePropertyTemplateTypeEnumBuilder());
		this.put("IFCAIRTERMINALBOXTYPEENUM", new IfcAirTerminalBoxTypeEnumBuilder());
		this.put("IFCPIPEFITTINGTYPEENUM", new IfcPipeFittingTypeEnumBuilder());
		this.put("IFCSPATIALZONETYPEENUM", new IfcSpatialZoneTypeEnumBuilder());
		this.put("IFCPROCEDURETYPEENUM", new IfcProcedureTypeEnumBuilder());
		this.put("IFCSWITCHINGDEVICETYPEENUM", new IfcSwitchingDeviceTypeEnumBuilder());
		this.put("IFCBURNERTYPEENUM", new IfcBurnerTypeEnumBuilder());
		this.put("IFCFURNITURETYPEENUM", new IfcFurnitureTypeEnumBuilder());
		this.put("IFCBEAMTYPEENUM", new IfcBeamTypeEnumBuilder());
		this.put("IFCSHADINGDEVICETYPEENUM", new IfcShadingDeviceTypeEnumBuilder());
		this.put("IFCMOTORCONNECTIONTYPEENUM", new IfcMotorConnectionTypeEnumBuilder());
		this.put("IFCREINFORCINGBARSURFACEENUM", new IfcReinforcingBarSurfaceEnumBuilder());
		this.put("IFCSTRUCTURALSURFACEMEMBERTYPEENUM", new IfcStructuralSurfaceMemberTypeEnumBuilder());
		this.put("IFCUNITARYEQUIPMENTTYPEENUM", new IfcUnitaryEquipmentTypeEnumBuilder());
		this.put("IFCENERGYMEASURE", new IfcEnergyMeasureBuilder());
		this.put("IFCMOLECULARWEIGHTMEASURE", new IfcMolecularWeightMeasureBuilder());
		this.put("IFCTHERMALADMITTANCEMEASURE", new IfcThermalAdmittanceMeasureBuilder());
		this.put("IFCTEXTALIGNMENT", new IfcTextAlignmentBuilder());
		this.put("IFCKNOTTYPE", new IfcKnotTypeBuilder());
		this.put("IFCCONSTRUCTIONMATERIALRESOURCETYPEENUM", new IfcConstructionMaterialResourceTypeEnumBuilder());
		this.put("IFCHEATEXCHANGERTYPEENUM", new IfcHeatExchangerTypeEnumBuilder());
		this.put("IFCINDUCTANCEMEASURE", new IfcInductanceMeasureBuilder());
		this.put("IFCFLOWDIRECTIONENUM", new IfcFlowDirectionEnumBuilder());
		this.put("IFCAMOUNTOFSUBSTANCEMEASURE", new IfcAmountOfSubstanceMeasureBuilder());
		this.put("IFCCOILTYPEENUM", new IfcCoilTypeEnumBuilder());
		this.put("IFCPOWERMEASURE", new IfcPowerMeasureBuilder());
		this.put("IFCNULLSTYLE", new IfcNullStyleBuilder());
		this.put("IFCANALYSISMODELTYPEENUM", new IfcAnalysisModelTypeEnumBuilder());
		this.put("IFCSENSORTYPEENUM", new IfcSensorTypeEnumBuilder());
		this.put("IFCALARMTYPEENUM", new IfcAlarmTypeEnumBuilder());
		this.put("IFCPERFORMANCEHISTORYTYPEENUM", new IfcPerformanceHistoryTypeEnumBuilder());
		this.put("IFCDOSEEQUIVALENTMEASURE", new IfcDoseEquivalentMeasureBuilder());
		this.put("IFCCOMPLEXPROPERTYTEMPLATETYPEENUM", new IfcComplexPropertyTemplateTypeEnumBuilder());
		this.put("IFCINVENTORYTYPEENUM", new IfcInventoryTypeEnumBuilder());
		this.put("IFCRAILINGTYPEENUM", new IfcRailingTypeEnumBuilder());
		this.put("IFCREINFORCINGBARROLEENUM", new IfcReinforcingBarRoleEnumBuilder());
		this.put("IFCPRESENTABLETEXT", new IfcPresentableTextBuilder());
		this.put("IFCTRANSPORTELEMENTTYPEENUM", new IfcTransportElementTypeEnumBuilder());
		this.put("IFCCOMPRESSORTYPEENUM", new IfcCompressorTypeEnumBuilder());
		this.put("IFCRAMPTYPEENUM", new IfcRampTypeEnumBuilder());
		this.put("IFCSOUNDPRESSURELEVELMEASURE", new IfcSoundPressureLevelMeasureBuilder());
		this.put("IFCTASKDURATIONENUM", new IfcTaskDurationEnumBuilder());
		this.put("IFCROOFTYPEENUM", new IfcRoofTypeEnumBuilder());
		this.put("IFCPROPERTYSETTEMPLATETYPEENUM", new IfcPropertySetTemplateTypeEnumBuilder());
		this.put("IFCPOSITIVEPLANEANGLEMEASURE", new IfcPositivePlaneAngleMeasureBuilder());
		this.put("IFCPARAMETERVALUE", new IfcParameterValueBuilder());
		this.put("IFCWINDOWPANELPOSITIONENUM", new IfcWindowPanelPositionEnumBuilder());
		this.put("IFCLOGICAL", new IfcLogicalBuilder());
		this.put("IFCMEDICALDEVICETYPEENUM", new IfcMedicalDeviceTypeEnumBuilder());
		this.put("IFCCOLUMNTYPEENUM", new IfcColumnTypeEnumBuilder());
		this.put("IFCMODULUSOFELASTICITYMEASURE", new IfcModulusOfElasticityMeasureBuilder());
		this.put("IFCAIRTOAIRHEATRECOVERYTYPEENUM", new IfcAirToAirHeatRecoveryTypeEnumBuilder());
		this.put("IFCDOCUMENTCONFIDENTIALITYENUM", new IfcDocumentConfidentialityEnumBuilder());
		this.put("IFCMODULUSOFROTATIONALSUBGRADEREACTIONMEASURE", new IfcModulusOfRotationalSubgradeReactionMeasureBuilder());
		this.put("IFCOCCUPANTTYPEENUM", new IfcOccupantTypeEnumBuilder());
		this.put("IFCCONTEXTDEPENDENTMEASURE", new IfcContextDependentMeasureBuilder());
		this.put("IFCVAPORPERMEABILITYMEASURE", new IfcVaporPermeabilityMeasureBuilder());
		this.put("IFCLAYERSETDIRECTIONENUM", new IfcLayerSetDirectionEnumBuilder());
		this.put("IFCCHILLERTYPEENUM", new IfcChillerTypeEnumBuilder());
		this.put("IFCURIREFERENCE", new IfcURIReferenceBuilder());
		this.put("IFCTENDONTYPEENUM", new IfcTendonTypeEnumBuilder());
		this.put("IFCEVENTTYPEENUM", new IfcEventTypeEnumBuilder());
		this.put("IFCSEQUENCEENUM", new IfcSequenceEnumBuilder());
		this.put("IFCINTEGERCOUNTRATEMEASURE", new IfcIntegerCountRateMeasureBuilder());
		this.put("IFCPROFILETYPEENUM", new IfcProfileTypeEnumBuilder());
		this.put("IFCRECURRENCETYPEENUM", new IfcRecurrenceTypeEnumBuilder());
		this.put("IFCRATIOMEASURE", new IfcRatioMeasureBuilder());
		this.put("IFCTRIMMINGPREFERENCE", new IfcTrimmingPreferenceBuilder());
		this.put("IFCBSPLINESURFACEFORM", new IfcBSplineSurfaceFormBuilder());
		this.put("IFCDOCUMENTSTATUSENUM", new IfcDocumentStatusEnumBuilder());
		this.put("IFCSTATEENUM", new IfcStateEnumBuilder());
		this.put("IFCWINDOWSTYLECONSTRUCTIONENUM", new IfcWindowStyleConstructionEnumBuilder());
		this.put("IFCPHYSICALORVIRTUALENUM", new IfcPhysicalOrVirtualEnumBuilder());
		this.put("IFCVOLUMETRICFLOWRATEMEASURE", new IfcVolumetricFlowRateMeasureBuilder());
		this.put("IFCCOMPOUNDPLANEANGLEMEASURE", new IfcCompoundPlaneAngleMeasureBuilder());
		this.put("IFCCOOLINGTOWERTYPEENUM", new IfcCoolingTowerTypeEnumBuilder());
		this.put("IFCTIMESTAMP", new IfcTimeStampBuilder());
		this.put("IFCCOMPLEXNUMBER", new IfcComplexNumberBuilder());
		this.put("IFCTUBEBUNDLETYPEENUM", new IfcTubeBundleTypeEnumBuilder());
		this.put("IFCACTIONSOURCETYPEENUM", new IfcActionSourceTypeEnumBuilder());
		this.put("IFCDISTRIBUTIONPORTTYPEENUM", new IfcDistributionPortTypeEnumBuilder());
		this.put("IFCLUMINOUSINTENSITYMEASURE", new IfcLuminousIntensityMeasureBuilder());
		this.put("IFCLINEARFORCEMEASURE", new IfcLinearForceMeasureBuilder());
		this.put("IFCWORKCALENDARTYPEENUM", new IfcWorkCalendarTypeEnumBuilder());
		this.put("IFCPROJECTORDERTYPEENUM", new IfcProjectOrderTypeEnumBuilder());
		this.put("IFCTEXTFONTNAME", new IfcTextFontNameBuilder());
		this.put("TIMESTAMPTEXT", new TimeStampTextBuilder());
		this.put("IFCRADIOACTIVITYMEASURE", new IfcRadioActivityMeasureBuilder());
		this.put("IFCMEMBERTYPEENUM", new IfcMemberTypeEnumBuilder());
		this.put("IFCACTUATORTYPEENUM", new IfcActuatorTypeEnumBuilder());
		this.put("IFCROTATIONALFREQUENCYMEASURE", new IfcRotationalFrequencyMeasureBuilder());
		this.put("IFCELEMENTASSEMBLYTYPEENUM", new IfcElementAssemblyTypeEnumBuilder());
		this.put("IFCWALLTYPEENUM", new IfcWallTypeEnumBuilder());
		this.put("IFCSURFACESIDE", new IfcSurfaceSideBuilder());
		this.put("IFCFORCEMEASURE", new IfcForceMeasureBuilder());
		this.put("IFCFLOWMETERTYPEENUM", new IfcFlowMeterTypeEnumBuilder());
		this.put("IFCGRIDTYPEENUM", new IfcGridTypeEnumBuilder());
		this.put("IFCSOUNDPRESSUREMEASURE", new IfcSoundPressureMeasureBuilder());
		this.put("IFCCONSTRUCTIONPRODUCTRESOURCETYPEENUM", new IfcConstructionProductResourceTypeEnumBuilder());
		this.put("IFCTIME", new IfcTimeBuilder());
		this.put("IFCACCELERATIONMEASURE", new IfcAccelerationMeasureBuilder());
		this.put("IFCWORKSCHEDULETYPEENUM", new IfcWorkScheduleTypeEnumBuilder());
		this.put("IFCFREQUENCYMEASURE", new IfcFrequencyMeasureBuilder());
		this.put("IFCBENCHMARKENUM", new IfcBenchmarkEnumBuilder());
		this.put("IFCLABEL", new IfcLabelBuilder());
		this.put("IFCDUCTSILENCERTYPEENUM", new IfcDuctSilencerTypeEnumBuilder());
		this.put("IFCFONTWEIGHT", new IfcFontWeightBuilder());
		this.put("IFCPROPERTYSETDEFINITIONSET", new IfcPropertySetDefinitionSetBuilder());
		this.put("IFCWINDOWPANELOPERATIONENUM", new IfcWindowPanelOperationEnumBuilder());
		this.put("IFCCOSTITEMTYPEENUM", new IfcCostItemTypeEnumBuilder());
		this.put("IFCEVAPORATIVECOOLERTYPEENUM", new IfcEvaporativeCoolerTypeEnumBuilder());
		this.put("IFCFILTERTYPEENUM", new IfcFilterTypeEnumBuilder());
		this.put("IFCPOSITIVERATIOMEASURE", new IfcPositiveRatioMeasureBuilder());
		this.put("IFCTEXTTRANSFORMATION", new IfcTextTransformationBuilder());
		this.put("IFCTEMPERATURERATEOFCHANGEMEASURE", new IfcTemperatureRateOfChangeMeasureBuilder());
		this.put("IFCPROTECTIVEDEVICETRIPPINGUNITTYPEENUM", new IfcProtectiveDeviceTrippingUnitTypeEnumBuilder());
		this.put("IFCMONETARYMEASURE", new IfcMonetaryMeasureBuilder());
		this.put("IFCILLUMINANCEMEASURE", new IfcIlluminanceMeasureBuilder());
		this.put("IFCCURVATUREMEASURE", new IfcCurvatureMeasureBuilder());
		this.put("IFCMAGNETICFLUXDENSITYMEASURE", new IfcMagneticFluxDensityMeasureBuilder());
		this.put("IFCHUMIDIFIERTYPEENUM", new IfcHumidifierTypeEnumBuilder());
		this.put("IFCREINFORCINGMESHTYPEENUM", new IfcReinforcingMeshTypeEnumBuilder());
		this.put("IFCPHMEASURE", new IfcPHMeasureBuilder());
		this.put("IFCAUDIOVISUALAPPLIANCETYPEENUM", new IfcAudioVisualApplianceTypeEnumBuilder());
		this.put("IFCHEATFLUXDENSITYMEASURE", new IfcHeatFluxDensityMeasureBuilder());
		this.put("IFCCONNECTIONTYPEENUM", new IfcConnectionTypeEnumBuilder());
		this.put("IFCGEOGRAPHICELEMENTTYPEENUM", new IfcGeographicElementTypeEnumBuilder());
		this.put("IFCMASSMEASURE", new IfcMassMeasureBuilder());
		this.put("IFCEVAPORATORTYPEENUM", new IfcEvaporatorTypeEnumBuilder());
		this.put("IFCDOORPANELPOSITIONENUM", new IfcDoorPanelPositionEnumBuilder());
		this.put("IFCSECTIONTYPEENUM", new IfcSectionTypeEnumBuilder());
		this.put("IFCSIUNITNAME", new IfcSIUnitNameBuilder());
		this.put("IFCWASTETERMINALTYPEENUM", new IfcWasteTerminalTypeEnumBuilder());
		this.put("IFCLIGHTEMISSIONSOURCEENUM", new IfcLightEmissionSourceEnumBuilder());
		this.put("IFCLIGHTFIXTURETYPEENUM", new IfcLightFixtureTypeEnumBuilder());
		this.put("IFCBUILDINGELEMENTPROXYTYPEENUM", new IfcBuildingElementProxyTypeEnumBuilder());
		this.put("IFCDURATION", new IfcDurationBuilder());
		this.put("IFCPILETYPEENUM", new IfcPileTypeEnumBuilder());
		this.put("IFCDAYINWEEKNUMBER", new IfcDayInWeekNumberBuilder());
		this.put("IFCLENGTHMEASURE", new IfcLengthMeasureBuilder());
		this.put("IFCREAL", new IfcRealBuilder());
		this.put("IFCCURTAINWALLTYPEENUM", new IfcCurtainWallTypeEnumBuilder());
		this.put("IFCDYNAMICVISCOSITYMEASURE", new IfcDynamicViscosityMeasureBuilder());
		this.put("IFCEXTERNALSPATIALELEMENTTYPEENUM", new IfcExternalSpatialElementTypeEnumBuilder());
		this.put("IFCSECTIONMODULUSMEASURE", new IfcSectionModulusMeasureBuilder());
		this.put("IFCROTATIONALMASSMEASURE", new IfcRotationalMassMeasureBuilder());
		this.put("IFCSTRUCTURALCURVEACTIVITYTYPEENUM", new IfcStructuralCurveActivityTypeEnumBuilder());
		this.put("IFCINTERNALOREXTERNALENUM", new IfcInternalOrExternalEnumBuilder());
		this.put("IFCOBJECTTYPEENUM", new IfcObjectTypeEnumBuilder());
		this.put("IFCCHIMNEYTYPEENUM", new IfcChimneyTypeEnumBuilder());
		this.put("IFCFANTYPEENUM", new IfcFanTypeEnumBuilder());
		this.put("IFCADDRESSTYPEENUM", new IfcAddressTypeEnumBuilder());
		this.put("IFCDISTRIBUTIONCHAMBERELEMENTTYPEENUM", new IfcDistributionChamberElementTypeEnumBuilder());
		this.put("IFCLABORRESOURCETYPEENUM", new IfcLaborResourceTypeEnumBuilder());
		this.put("IFCGEOMETRICPROJECTIONENUM", new IfcGeometricProjectionEnumBuilder());
		this.put("IFCDUCTFITTINGTYPEENUM", new IfcDuctFittingTypeEnumBuilder());
		this.put("IFCSLABTYPEENUM", new IfcSlabTypeEnumBuilder());
		this.put("IFCPROJECTEDORTRUELENGTHENUM", new IfcProjectedOrTrueLengthEnumBuilder());
		this.put("IFCDOORTYPEENUM", new IfcDoorTypeEnumBuilder());
		this.put("IFCAREAMEASURE", new IfcAreaMeasureBuilder());
		this.put("IFCLANGUAGEID", new IfcLanguageIdBuilder());
		this.put("IFCMASSPERLENGTHMEASURE", new IfcMassPerLengthMeasureBuilder());
		this.put("IFCSTRUCTURALCURVEMEMBERTYPEENUM", new IfcStructuralCurveMemberTypeEnumBuilder());
		this.put("IFCBUILDINGELEMENTPARTTYPEENUM", new IfcBuildingElementPartTypeEnumBuilder());
		this.put("IFCIDENTIFIER", new IfcIdentifierBuilder());
		this.put("IFCLINEARSTIFFNESSMEASURE", new IfcLinearStiffnessMeasureBuilder());
		this.put("IFCLIGHTDISTRIBUTIONCURVEENUM", new IfcLightDistributionCurveEnumBuilder());
		this.put("IFCTIMESERIESDATATYPEENUM", new IfcTimeSeriesDataTypeEnumBuilder());
		this.put("IFCMOISTUREDIFFUSIVITYMEASURE", new IfcMoistureDiffusivityMeasureBuilder());
		this.put("IFCSYSTEMFURNITUREELEMENTTYPEENUM", new IfcSystemFurnitureElementTypeEnumBuilder());
		this.put("IFCLUMINOUSINTENSITYDISTRIBUTIONMEASURE", new IfcLuminousIntensityDistributionMeasureBuilder());
		this.put("IFCDOORSTYLEOPERATIONENUM", new IfcDoorStyleOperationEnumBuilder());
		this.put("IFCMODULUSOFLINEARSUBGRADEREACTIONMEASURE", new IfcModulusOfLinearSubgradeReactionMeasureBuilder());
		this.put("IFCSPACEHEATERTYPEENUM", new IfcSpaceHeaterTypeEnumBuilder());
		this.put("IFCBOOLEAN", new IfcBooleanBuilder());
		this.put("IFCTANKTYPEENUM", new IfcTankTypeEnumBuilder());
		this.put("IFCSECTIONALAREAINTEGRALMEASURE", new IfcSectionalAreaIntegralMeasureBuilder());
		this.put("IFCDAMPERTYPEENUM", new IfcDamperTypeEnumBuilder());
		this.put("IFCCABLECARRIERSEGMENTTYPEENUM", new IfcCableCarrierSegmentTypeEnumBuilder());
		this.put("IFCPILECONSTRUCTIONENUM", new IfcPileConstructionEnumBuilder());
		this.put("IFCCABLECARRIERFITTINGTYPEENUM", new IfcCableCarrierFittingTypeEnumBuilder());
		this.put("IFCDIMENSIONCOUNT", new IfcDimensionCountBuilder());
		this.put("IFCPERMEABLECOVERINGOPERATIONENUM", new IfcPermeableCoveringOperationEnumBuilder());
		this.put("IFCDERIVEDUNITENUM", new IfcDerivedUnitEnumBuilder());
		this.put("IFCPIPESEGMENTTYPEENUM", new IfcPipeSegmentTypeEnumBuilder());
		this.put("IFCGLOBALLYUNIQUEID", new IfcGloballyUniqueIdBuilder());
		this.put("IFCAIRTERMINALTYPEENUM", new IfcAirTerminalTypeEnumBuilder());
		this.put("IFCISOTHERMALMOISTURECAPACITYMEASURE", new IfcIsothermalMoistureCapacityMeasureBuilder());
		this.put("IFCREINFORCINGBARTYPEENUM", new IfcReinforcingBarTypeEnumBuilder());
		this.put("IFCNONNEGATIVELENGTHMEASURE", new IfcNonNegativeLengthMeasureBuilder());
		this.put("IFCNUMERICMEASURE", new IfcNumericMeasureBuilder());
		this.put("IFCCONSTRAINTENUM", new IfcConstraintEnumBuilder());
		this.put("IFCBUILDINGSYSTEMTYPEENUM", new IfcBuildingSystemTypeEnumBuilder());
		this.put("IFCPROTECTIVEDEVICETYPEENUM", new IfcProtectiveDeviceTypeEnumBuilder());
		this.put("IFCOUTLETTYPEENUM", new IfcOutletTypeEnumBuilder());
		this.put("IFCHEATINGVALUEMEASURE", new IfcHeatingValueMeasureBuilder());
		this.put("IFCCOVERINGTYPEENUM", new IfcCoveringTypeEnumBuilder());
		this.put("IFCWARPINGCONSTANTMEASURE", new IfcWarpingConstantMeasureBuilder());
		this.put("IFCVALVETYPEENUM", new IfcValveTypeEnumBuilder());
		this.put("IFCBOXALIGNMENT", new IfcBoxAlignmentBuilder());
		this.put("IFCSTACKTERMINALTYPEENUM", new IfcStackTerminalTypeEnumBuilder());
		this.put("IFCSOLARDEVICETYPEENUM", new IfcSolarDeviceTypeEnumBuilder());
		this.put("IFCLINEARMOMENTMEASURE", new IfcLinearMomentMeasureBuilder());
		this.put("IFCEVENTTRIGGERTYPEENUM", new IfcEventTriggerTypeEnumBuilder());
		this.put("IFCVIBRATIONISOLATORTYPEENUM", new IfcVibrationIsolatorTypeEnumBuilder());
		this.put("IFCDISTRIBUTIONSYSTEMENUM", new IfcDistributionSystemEnumBuilder());
		this.put("IFCACTIONREQUESTTYPEENUM", new IfcActionRequestTypeEnumBuilder());
		this.put("IFCELECTRICVOLTAGEMEASURE", new IfcElectricVoltageMeasureBuilder());
		this.put("IFCTHERMALEXPANSIONCOEFFICIENTMEASURE", new IfcThermalExpansionCoefficientMeasureBuilder());
		this.put("IFCPLANARFORCEMEASURE", new IfcPlanarForceMeasureBuilder());
		this.put("IFCINTERCEPTORTYPEENUM", new IfcInterceptorTypeEnumBuilder());
		this.put("IFCABSORBEDDOSEMEASURE", new IfcAbsorbedDoseMeasureBuilder());
		this.put("IFCCOSTSCHEDULETYPEENUM", new IfcCostScheduleTypeEnumBuilder());
		this.put("IFCTHERMALTRANSMITTANCEMEASURE", new IfcThermalTransmittanceMeasureBuilder());
		this.put("IFCBOILERTYPEENUM", new IfcBoilerTypeEnumBuilder());
		this.put("IFCTEMPERATUREGRADIENTMEASURE", new IfcTemperatureGradientMeasureBuilder());
		this.put("IFCELECTRICGENERATORTYPEENUM", new IfcElectricGeneratorTypeEnumBuilder());
		this.put("IFCTEXTDECORATION", new IfcTextDecorationBuilder());
		this.put("IFCTRANSITIONCODE", new IfcTransitionCodeBuilder());
		this.put("IFCSTAIRFLIGHTTYPEENUM", new IfcStairFlightTypeEnumBuilder());
		this.put("IFCACTIONTYPEENUM", new IfcActionTypeEnumBuilder());
		this.put("IFCCOMMUNICATIONSAPPLIANCETYPEENUM", new IfcCommunicationsApplianceTypeEnumBuilder());
		this.put("IFCSTRUCTURALSURFACEACTIVITYTYPEENUM", new IfcStructuralSurfaceActivityTypeEnumBuilder());
		this.put("IFCPERMITTYPEENUM", new IfcPermitTypeEnumBuilder());
		this.put("IFCDIRECTION", new IfcDirectionBuilder());
		this.put("IFCJUNCTIONBOXTYPE", new IfcJunctionBoxTypeBuilder());
		this.put("IFCFIRESUPPRESSIONTERMINALTYPE", new IfcFireSuppressionTerminalTypeBuilder());
		this.put("IFCREINFORCINGBAR", new IfcReinforcingBarBuilder());
		this.put("IFCFAN", new IfcFanBuilder());
		this.put("IFCDUCTSEGMENTTYPE", new IfcDuctSegmentTypeBuilder());
		this.put("IFCTYPEOBJECT", new IfcTypeObjectBuilder());
		this.put("IFCFACESURFACE", new IfcFaceSurfaceBuilder());
		this.put("IFCCIRCLEPROFILEDEF", new IfcCircleProfileDefBuilder());
		this.put("IFCSUBCONTRACTRESOURCETYPE", new IfcSubContractResourceTypeBuilder());
		this.put("IFCGEOMETRICCURVESET", new IfcGeometricCurveSetBuilder());
		this.put("IFCFANTYPE", new IfcFanTypeBuilder());
		this.put("IFCCOOLEDBEAM", new IfcCooledBeamBuilder());
		this.put("IFCEVAPORATIVECOOLERTYPE", new IfcEvaporativeCoolerTypeBuilder());
		this.put("IFCRELDEFINESBYOBJECT", new IfcRelDefinesByObjectBuilder());
		this.put("IFCELLIPSE", new IfcEllipseBuilder());
		this.put("IFCPOLYGONALBOUNDEDHALFSPACE", new IfcPolygonalBoundedHalfSpaceBuilder());
		this.put("IFCSECTIONEDSPINE", new IfcSectionedSpineBuilder());
		this.put("IFCGROUP", new IfcGroupBuilder());
		this.put("IFCPOLYLOOP", new IfcPolyLoopBuilder());
		this.put("IFCCOMPRESSOR", new IfcCompressorBuilder());
		this.put("IFCBOILER", new IfcBoilerBuilder());
		this.put("IFCDRAUGHTINGPREDEFINEDCOLOUR", new IfcDraughtingPreDefinedColourBuilder());
		this.put("IFCHUMIDIFIER", new IfcHumidifierBuilder());
		this.put("IFCSURFACESTYLESHADING", new IfcSurfaceStyleShadingBuilder());
		this.put("IFCADVANCEDBREPWITHVOIDS", new IfcAdvancedBrepWithVoidsBuilder());
		this.put("IFCSOLARDEVICE", new IfcSolarDeviceBuilder());
		this.put("IFCORGANIZATION", new IfcOrganizationBuilder());
		this.put("IFCMATERIALPROFILE", new IfcMaterialProfileBuilder());
		this.put("IFCQUANTITYTIME", new IfcQuantityTimeBuilder());
		this.put("IFCTRIANGULATEDFACESET", new IfcTriangulatedFaceSetBuilder());
		this.put("IFCHEATEXCHANGERTYPE", new IfcHeatExchangerTypeBuilder());
		this.put("IFCRELCONNECTSWITHECCENTRICITY", new IfcRelConnectsWithEccentricityBuilder());
		this.put("IFCCOLUMNTYPE", new IfcColumnTypeBuilder());
		this.put("IFCPRODUCTDEFINITIONSHAPE", new IfcProductDefinitionShapeBuilder());
		this.put("IFCACTORROLE", new IfcActorRoleBuilder());
		this.put("IFCTABLEROW", new IfcTableRowBuilder());
		this.put("IFCVERTEXPOINT", new IfcVertexPointBuilder());
		this.put("IFCMEMBER", new IfcMemberBuilder());
		this.put("IFCRELSPACEBOUNDARY", new IfcRelSpaceBoundaryBuilder());
		this.put("IFCWINDOWSTANDARDCASE", new IfcWindowStandardCaseBuilder());
		this.put("IFCMATERIALCLASSIFICATIONRELATIONSHIP", new IfcMaterialClassificationRelationshipBuilder());
		this.put("IFCCONDENSERTYPE", new IfcCondenserTypeBuilder());
		this.put("IFCCHILLERTYPE", new IfcChillerTypeBuilder());
		this.put("IFCCIVILELEMENTTYPE", new IfcCivilElementTypeBuilder());
		this.put("IFCMATERIALLAYERSETUSAGE", new IfcMaterialLayerSetUsageBuilder());
		this.put("IFCREFERENCE", new IfcReferenceBuilder());
		this.put("IFCCONSTRUCTIONEQUIPMENTRESOURCE", new IfcConstructionEquipmentResourceBuilder());
		this.put("IFCALARMTYPE", new IfcAlarmTypeBuilder());
		this.put("IFCALARM", new IfcAlarmBuilder());
		this.put("IFCTUBEBUNDLETYPE", new IfcTubeBundleTypeBuilder());
		this.put("IFCASSET", new IfcAssetBuilder());
		this.put("IFCWORKCALENDAR", new IfcWorkCalendarBuilder());
		this.put("IFCCURRENCYRELATIONSHIP", new IfcCurrencyRelationshipBuilder());
		this.put("IFCCIVILELEMENT", new IfcCivilElementBuilder());
		this.put("IFCSLABSTANDARDCASE", new IfcSlabStandardCaseBuilder());
		this.put("IFCPOINTONCURVE", new IfcPointOnCurveBuilder());
		this.put("IFCCYLINDRICALSURFACE", new IfcCylindricalSurfaceBuilder());
		this.put("IFCRELCONNECTSSTRUCTURALMEMBER", new IfcRelConnectsStructuralMemberBuilder());
		this.put("IFCELEMENTASSEMBLYTYPE", new IfcElementAssemblyTypeBuilder());
		this.put("IFCDIMENSIONALEXPONENTS", new IfcDimensionalExponentsBuilder());
		this.put("IFCRAMPFLIGHTTYPE", new IfcRampFlightTypeBuilder());
		this.put("IFCDERIVEDUNIT", new IfcDerivedUnitBuilder());
		this.put("IFCCURVESTYLEFONTANDSCALING", new IfcCurveStyleFontAndScalingBuilder());
		this.put("IFCREVOLVEDAREASOLIDTAPERED", new IfcRevolvedAreaSolidTaperedBuilder());
		this.put("IFCFACEOUTERBOUND", new IfcFaceOuterBoundBuilder());
		this.put("IFCPIPEFITTING", new IfcPipeFittingBuilder());
		this.put("IFCOPENINGELEMENT", new IfcOpeningElementBuilder());
		this.put("IFCLIGHTSOURCEPOSITIONAL", new IfcLightSourcePositionalBuilder());
		this.put("IFCAIRTOAIRHEATRECOVERY", new IfcAirToAirHeatRecoveryBuilder());
		this.put("IFCRELDEFINESBYTYPE", new IfcRelDefinesByTypeBuilder());
		this.put("IFCSUBCONTRACTRESOURCE", new IfcSubContractResourceBuilder());
		this.put("IFCSURFACESTYLE", new IfcSurfaceStyleBuilder());
		this.put("IFCLABORRESOURCE", new IfcLaborResourceBuilder());
		this.put("IFCCOSTITEM", new IfcCostItemBuilder());
		this.put("IFCCOIL", new IfcCoilBuilder());
		this.put("IFCRELSPACEBOUNDARY1STLEVEL", new IfcRelSpaceBoundary1stLevelBuilder());
		this.put("IFCCONTROLLERTYPE", new IfcControllerTypeBuilder());
		this.put("IFCTENDONANCHOR", new IfcTendonAnchorBuilder());
		this.put("IFCEXTERNALSPATIALELEMENT", new IfcExternalSpatialElementBuilder());
		this.put("IFCTRANSFORMERTYPE", new IfcTransformerTypeBuilder());
		this.put("IFCRELASSIGNSTOCONTROL", new IfcRelAssignsToControlBuilder());
		this.put("IFCSUBEDGE", new IfcSubedgeBuilder());
		this.put("IFCDISTRIBUTIONCHAMBERELEMENTTYPE", new IfcDistributionChamberElementTypeBuilder());
		this.put("IFCVALVE", new IfcValveBuilder());
		this.put("IFCQUANTITYCOUNT", new IfcQuantityCountBuilder());
		this.put("IFCCOLUMNSTANDARDCASE", new IfcColumnStandardCaseBuilder());
		this.put("IFCRELASSOCIATESAPPROVAL", new IfcRelAssociatesApprovalBuilder());
		this.put("IFCCOVERINGTYPE", new IfcCoveringTypeBuilder());
		this.put("IFCLINE", new IfcLineBuilder());
		this.put("IFCSTRUCTURALLOADPLANARFORCE", new IfcStructuralLoadPlanarForceBuilder());
		this.put("IFCSANITARYTERMINALTYPE", new IfcSanitaryTerminalTypeBuilder());
		this.put("IFCLIGHTDISTRIBUTIONDATA", new IfcLightDistributionDataBuilder());
		this.put("IFCWASTETERMINALTYPE", new IfcWasteTerminalTypeBuilder());
		this.put("IFCFILLAREASTYLETILES", new IfcFillAreaStyleTilesBuilder());
		this.put("IFCDUCTFITTINGTYPE", new IfcDuctFittingTypeBuilder());
		this.put("IFCSURFACESTYLELIGHTING", new IfcSurfaceStyleLightingBuilder());
		this.put("IFCSITE", new IfcSiteBuilder());
		this.put("IFCDUCTSILENCER", new IfcDuctSilencerBuilder());
		this.put("IFCTRIMMEDCURVE", new IfcTrimmedCurveBuilder());
		this.put("IFCCOLOURRGB", new IfcColourRgbBuilder());
		this.put("IFCRELASSOCIATESMATERIAL", new IfcRelAssociatesMaterialBuilder());
		this.put("IFCELECTRICGENERATORTYPE", new IfcElectricGeneratorTypeBuilder());
		this.put("IFCDUCTSEGMENT", new IfcDuctSegmentBuilder());
		this.put("IFCPILE", new IfcPileBuilder());
		this.put("IFCDISTRIBUTIONSYSTEM", new IfcDistributionSystemBuilder());
		this.put("IFCMATERIAL", new IfcMaterialBuilder());
		this.put("IFCRELSPACEBOUNDARY2NDLEVEL", new IfcRelSpaceBoundary2ndLevelBuilder());
		this.put("IFCWALLSTANDARDCASE", new IfcWallStandardCaseBuilder());
		this.put("IFCREPARAMETRISEDCOMPOSITECURVESEGMENT", new IfcReparametrisedCompositeCurveSegmentBuilder());
		this.put("IFCBEAM", new IfcBeamBuilder());
		this.put("IFCOFFSETCURVE3D", new IfcOffsetCurve3DBuilder());
		this.put("IFCAPPROVAL", new IfcApprovalBuilder());
		this.put("IFCISHAPEPROFILEDEF", new IfcIShapeProfileDefBuilder());
		this.put("IFCDISTRIBUTIONELEMENTTYPE", new IfcDistributionElementTypeBuilder());
		this.put("IFCVALVETYPE", new IfcValveTypeBuilder());
		this.put("IFCEXTRUDEDAREASOLID", new IfcExtrudedAreaSolidBuilder());
		this.put("IFCCONVERSIONBASEDUNITWITHOFFSET", new IfcConversionBasedUnitWithOffsetBuilder());
		this.put("IFCRELINTERFERESELEMENTS", new IfcRelInterferesElementsBuilder());
		this.put("IFCTEXTURECOORDINATEGENERATOR", new IfcTextureCoordinateGeneratorBuilder());
		this.put("IFCPROPERTYSET", new IfcPropertySetBuilder());
		this.put("IFCPROTECTIVEDEVICETYPE", new IfcProtectiveDeviceTypeBuilder());
		this.put("IFCOFFSETCURVE2D", new IfcOffsetCurve2DBuilder());
		this.put("IFCSLABELEMENTEDCASE", new IfcSlabElementedCaseBuilder());
		this.put("IFCCABLESEGMENT", new IfcCableSegmentBuilder());
		this.put("IFCBOUNDARYNODECONDITIONWARPING", new IfcBoundaryNodeConditionWarpingBuilder());
		this.put("IFCPROPERTYSETTEMPLATE", new IfcPropertySetTemplateBuilder());
		this.put("IFCREINFORCINGMESH", new IfcReinforcingMeshBuilder());
		this.put("IFCZONE", new IfcZoneBuilder());
		this.put("IFCDISTRIBUTIONCIRCUIT", new IfcDistributionCircuitBuilder());
		this.put("IFCSTAIRFLIGHTTYPE", new IfcStairFlightTypeBuilder());
		this.put("IFCMEMBERTYPE", new IfcMemberTypeBuilder());
		this.put("IFCTEXTUREVERTEX", new IfcTextureVertexBuilder());
		this.put("IFCSTAIRTYPE", new IfcStairTypeBuilder());
		this.put("IFCMEASUREWITHUNIT", new IfcMeasureWithUnitBuilder());
		this.put("IFCMONETARYUNIT", new IfcMonetaryUnitBuilder());
		this.put("IFCQUANTITYAREA", new IfcQuantityAreaBuilder());
		this.put("IFCTEXTLITERALWITHEXTENT", new IfcTextLiteralWithExtentBuilder());
		this.put("IFCSURFACEREINFORCEMENTAREA", new IfcSurfaceReinforcementAreaBuilder());
		this.put("IFCRELAGGREGATES", new IfcRelAggregatesBuilder());
		this.put("IFCCOMPOSITECURVE", new IfcCompositeCurveBuilder());
		this.put("IFCTEXTSTYLEFONTMODEL", new IfcTextStyleFontModelBuilder());
		this.put("IFCPROPERTYENUMERATEDVALUE", new IfcPropertyEnumeratedValueBuilder());
		this.put("IFCMATERIALPROFILESET", new IfcMaterialProfileSetBuilder());
		this.put("IFCBUILDING", new IfcBuildingBuilder());
		this.put("IFCCONVERSIONBASEDUNIT", new IfcConversionBasedUnitBuilder());
		this.put("IFCSWITCHINGDEVICETYPE", new IfcSwitchingDeviceTypeBuilder());
		this.put("IFCPLATETYPE", new IfcPlateTypeBuilder());
		this.put("IFCDOORSTYLE", new IfcDoorStyleBuilder());
		this.put("IFCPROJECTORDER", new IfcProjectOrderBuilder());
		this.put("IFCSPACE", new IfcSpaceBuilder());
		this.put("IFCWINDOWTYPE", new IfcWindowTypeBuilder());
		this.put("IFCBUILDINGSYSTEM", new IfcBuildingSystemBuilder());
		this.put("IFCSTRUCTURALCURVEACTION", new IfcStructuralCurveActionBuilder());
		this.put("IFCSURFACESTYLEREFRACTION", new IfcSurfaceStyleRefractionBuilder());
		this.put("IFCFLOWSEGMENT", new IfcFlowSegmentBuilder());
		this.put("IFCSURFACEOFLINEAREXTRUSION", new IfcSurfaceOfLinearExtrusionBuilder());
		this.put("IFCTRANSPORTELEMENTTYPE", new IfcTransportElementTypeBuilder());
		this.put("IFCRECTANGLEHOLLOWPROFILEDEF", new IfcRectangleHollowProfileDefBuilder());
		this.put("IFCDISTRIBUTIONELEMENT", new IfcDistributionElementBuilder());
		this.put("IFCMATERIALPROPERTIES", new IfcMaterialPropertiesBuilder());
		this.put("IFCADVANCEDBREP", new IfcAdvancedBrepBuilder());
		this.put("IFCFILTERTYPE", new IfcFilterTypeBuilder());
		this.put("IFCEXTERNALLYDEFINEDTEXTFONT", new IfcExternallyDefinedTextFontBuilder());
		this.put("IFCSTRUCTURALPOINTCONNECTION", new IfcStructuralPointConnectionBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR3DNONUNIFORM", new IfcCartesianTransformationOperator3DnonUniformBuilder());
		this.put("IFCQUANTITYVOLUME", new IfcQuantityVolumeBuilder());
		this.put("IFCREPRESENTATIONMAP", new IfcRepresentationMapBuilder());
		this.put("IFCSTRUCTURALCURVECONNECTION", new IfcStructuralCurveConnectionBuilder());
		this.put("IFCGRIDAXIS", new IfcGridAxisBuilder());
		this.put("IFCBOOLEANRESULT", new IfcBooleanResultBuilder());
		this.put("IFCPIPESEGMENTTYPE", new IfcPipeSegmentTypeBuilder());
		this.put("IFCEXTRUDEDAREASOLIDTAPERED", new IfcExtrudedAreaSolidTaperedBuilder());
		this.put("IFCTABLECOLUMN", new IfcTableColumnBuilder());
		this.put("IFCMEDICALDEVICE", new IfcMedicalDeviceBuilder());
		this.put("IFCPERMEABLECOVERINGPROPERTIES", new IfcPermeableCoveringPropertiesBuilder());
		this.put("IFCAXIS1PLACEMENT", new IfcAxis1PlacementBuilder());
		this.put("IFCRELDECLARES", new IfcRelDeclaresBuilder());
		this.put("IFCDERIVEDUNITELEMENT", new IfcDerivedUnitElementBuilder());
		this.put("IFCOPENINGSTANDARDCASE", new IfcOpeningStandardCaseBuilder());
		this.put("IFCCSGSOLID", new IfcCsgSolidBuilder());
		this.put("IFCFACETEDBREP", new IfcFacetedBrepBuilder());
		this.put("IFCRELCONNECTSPORTTOELEMENT", new IfcRelConnectsPortToElementBuilder());
		this.put("IFCDERIVEDPROFILEDEF", new IfcDerivedProfileDefBuilder());
		this.put("IFCBURNERTYPE", new IfcBurnerTypeBuilder());
		this.put("IFCWASTETERMINAL", new IfcWasteTerminalBuilder());
		this.put("IFCPROJECTEDCRS", new IfcProjectedCRSBuilder());
		this.put("IFCSTRUCTURALLOADLINEARFORCE", new IfcStructuralLoadLinearForceBuilder());
		this.put("IFCRELDEFINESBYPROPERTIES", new IfcRelDefinesByPropertiesBuilder());
		this.put("IFCPIXELTEXTURE", new IfcPixelTextureBuilder());
		this.put("IFCSTAIR", new IfcStairBuilder());
		this.put("IFCTEXTSTYLETEXTMODEL", new IfcTextStyleTextModelBuilder());
		this.put("IFCENGINETYPE", new IfcEngineTypeBuilder());
		this.put("IFCSANITARYTERMINAL", new IfcSanitaryTerminalBuilder());
		this.put("IFCCONDENSER", new IfcCondenserBuilder());
		this.put("IFCDOORSTANDARDCASE", new IfcDoorStandardCaseBuilder());
		this.put("IFCMEMBERSTANDARDCASE", new IfcMemberStandardCaseBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEDISPLACEMENT", new IfcStructuralLoadSingleDisplacementBuilder());
		this.put("IFCCREWRESOURCETYPE", new IfcCrewResourceTypeBuilder());
		this.put("IFCWINDOWPANELPROPERTIES", new IfcWindowPanelPropertiesBuilder());
		this.put("IFCAUDIOVISUALAPPLIANCE", new IfcAudioVisualApplianceBuilder());
		this.put("IFCELECTRICTIMECONTROLTYPE", new IfcElectricTimeControlTypeBuilder());
		this.put("IFCEVAPORATORTYPE", new IfcEvaporatorTypeBuilder());
		this.put("IFCAIRTOAIRHEATRECOVERYTYPE", new IfcAirToAirHeatRecoveryTypeBuilder());
		this.put("IFCMIRROREDPROFILEDEF", new IfcMirroredProfileDefBuilder());
		this.put("IFCPROPERTYLISTVALUE", new IfcPropertyListValueBuilder());
		this.put("IFCSOLARDEVICETYPE", new IfcSolarDeviceTypeBuilder());
		this.put("IFCBOOLEANCLIPPINGRESULT", new IfcBooleanClippingResultBuilder());
		this.put("IFCEVENTTYPE", new IfcEventTypeBuilder());
		this.put("IFCADVANCEDFACE", new IfcAdvancedFaceBuilder());
		this.put("IFCCOVERING", new IfcCoveringBuilder());
		this.put("IFCAIRTERMINALBOX", new IfcAirTerminalBoxBuilder());
		this.put("IFCPROPERTYDEPENDENCYRELATIONSHIP", new IfcPropertyDependencyRelationshipBuilder());
		this.put("IFCAPPROVALRELATIONSHIP", new IfcApprovalRelationshipBuilder());
		this.put("IFCSTRUCTURALRESULTGROUP", new IfcStructuralResultGroupBuilder());
		this.put("IFCBEAMTYPE", new IfcBeamTypeBuilder());
		this.put("IFCCABLECARRIERSEGMENT", new IfcCableCarrierSegmentBuilder());
		this.put("IFCRECTANGLEPROFILEDEF", new IfcRectangleProfileDefBuilder());
		this.put("IFCCURVESTYLEFONTPATTERN", new IfcCurveStyleFontPatternBuilder());
		this.put("IFCLIGHTINTENSITYDISTRIBUTION", new IfcLightIntensityDistributionBuilder());
		this.put("IFCLAMPTYPE", new IfcLampTypeBuilder());
		this.put("IFCBOUNDARYCURVE", new IfcBoundaryCurveBuilder());
		this.put("IFCPATH", new IfcPathBuilder());
		this.put("IFCEVENTTIME", new IfcEventTimeBuilder());
		this.put("IFCEXTERNALLYDEFINEDHATCHSTYLE", new IfcExternallyDefinedHatchStyleBuilder());
		this.put("IFCEXTERNALREFERENCERELATIONSHIP", new IfcExternalReferenceRelationshipBuilder());
		this.put("IFCSECTIONPROPERTIES", new IfcSectionPropertiesBuilder());
		this.put("IFCGEOMETRICREPRESENTATIONSUBCONTEXT", new IfcGeometricRepresentationSubContextBuilder());
		this.put("IFCBOILERTYPE", new IfcBoilerTypeBuilder());
		this.put("IFCRELREFERENCEDINSPATIALSTRUCTURE", new IfcRelReferencedInSpatialStructureBuilder());
		this.put("IFCMATERIALPROFILESETUSAGE", new IfcMaterialProfileSetUsageBuilder());
		this.put("IFCRELASSOCIATESDOCUMENT", new IfcRelAssociatesDocumentBuilder());
		this.put("IFCPRESENTATIONLAYERWITHSTYLE", new IfcPresentationLayerWithStyleBuilder());
		this.put("IFCFLOWCONTROLLER", new IfcFlowControllerBuilder());
		this.put("IFCROOF", new IfcRoofBuilder());
		this.put("IFCVECTOR", new IfcVectorBuilder());
		this.put("IFCHALFSPACESOLID", new IfcHalfSpaceSolidBuilder());
		this.put("IFCFURNISHINGELEMENT", new IfcFurnishingElementBuilder());
		this.put("IFCSPACEHEATER", new IfcSpaceHeaterBuilder());
		this.put("IFCMOTORCONNECTION", new IfcMotorConnectionBuilder());
		this.put("IFCREINFORCINGBARTYPE", new IfcReinforcingBarTypeBuilder());
		this.put("IFCOUTERBOUNDARYCURVE", new IfcOuterBoundaryCurveBuilder());
		this.put("IFCPROFILEDEF", new IfcProfileDefBuilder());
		this.put("IFCPOSTALADDRESS", new IfcPostalAddressBuilder());
		this.put("IFCFLOWTERMINAL", new IfcFlowTerminalBuilder());
		this.put("IFCCOMPOSITECURVEONSURFACE", new IfcCompositeCurveOnSurfaceBuilder());
		this.put("IFCSHADINGDEVICETYPE", new IfcShadingDeviceTypeBuilder());
		this.put("IFCELECTRICGENERATOR", new IfcElectricGeneratorBuilder());
		this.put("IFCPROJECT", new IfcProjectBuilder());
		this.put("IFCEVENT", new IfcEventBuilder());
		this.put("IFCDOCUMENTREFERENCE", new IfcDocumentReferenceBuilder());
		this.put("IFCRELASSOCIATESLIBRARY", new IfcRelAssociatesLibraryBuilder());
		this.put("IFCBUILDINGSTOREY", new IfcBuildingStoreyBuilder());
		this.put("IFCRAMPTYPE", new IfcRampTypeBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR2DNONUNIFORM", new IfcCartesianTransformationOperator2DnonUniformBuilder());
		this.put("IFCMECHANICALFASTENER", new IfcMechanicalFastenerBuilder());
		this.put("IFCPROJECTIONELEMENT", new IfcProjectionElementBuilder());
		this.put("IFCRELSEQUENCE", new IfcRelSequenceBuilder());
		this.put("IFCVIBRATIONISOLATOR", new IfcVibrationIsolatorBuilder());
		this.put("IFCFOOTING", new IfcFootingBuilder());
		this.put("IFCCONNECTEDFACESET", new IfcConnectedFaceSetBuilder());
		this.put("IFCPROFILEPROPERTIES", new IfcProfilePropertiesBuilder());
		this.put("IFCLIGHTSOURCESPOT", new IfcLightSourceSpotBuilder());
		this.put("IFCDOORTYPE", new IfcDoorTypeBuilder());
		this.put("IFCPROTECTIVEDEVICE", new IfcProtectiveDeviceBuilder());
		this.put("IFCMAPCONVERSION", new IfcMapConversionBuilder());
		this.put("IFCSTRUCTURALPLANARACTION", new IfcStructuralPlanarActionBuilder());
		this.put("IFCPERSONANDORGANIZATION", new IfcPersonAndOrganizationBuilder());
		this.put("IFCUSHAPEPROFILEDEF", new IfcUShapeProfileDefBuilder());
		this.put("IFCROOFTYPE", new IfcRoofTypeBuilder());
		this.put("IFCFILTER", new IfcFilterBuilder());
		this.put("IFCSURFACEOFREVOLUTION", new IfcSurfaceOfRevolutionBuilder());
		this.put("IFCSTRUCTURALLOADTEMPERATURE", new IfcStructuralLoadTemperatureBuilder());
		this.put("IFCCOSTVALUE", new IfcCostValueBuilder());
		this.put("IFCRIGHTCIRCULARCYLINDER", new IfcRightCircularCylinderBuilder());
		this.put("IFCFILLAREASTYLEHATCHING", new IfcFillAreaStyleHatchingBuilder());
		this.put("IFCPLATESTANDARDCASE", new IfcPlateStandardCaseBuilder());
		this.put("IFCSHAPEASPECT", new IfcShapeAspectBuilder());
		this.put("IFCSTRUCTURALSURFACEACTION", new IfcStructuralSurfaceActionBuilder());
		this.put("IFCIRREGULARTIMESERIES", new IfcIrregularTimeSeriesBuilder());
		this.put("IFCCONSTRUCTIONMATERIALRESOURCE", new IfcConstructionMaterialResourceBuilder());
		this.put("IFCRELCONNECTSPATHELEMENTS", new IfcRelConnectsPathElementsBuilder());
		this.put("IFCCOMPOSITECURVESEGMENT", new IfcCompositeCurveSegmentBuilder());
		this.put("IFCJUNCTIONBOX", new IfcJunctionBoxBuilder());
		this.put("IFCDISTRIBUTIONCONTROLELEMENT", new IfcDistributionControlElementBuilder());
		this.put("IFCINVENTORY", new IfcInventoryBuilder());
		this.put("IFCTSHAPEPROFILEDEF", new IfcTShapeProfileDefBuilder());
		this.put("IFCLAGTIME", new IfcLagTimeBuilder());
		this.put("IFCMATERIALCONSTITUENT", new IfcMaterialConstituentBuilder());
		this.put("IFCGRID", new IfcGridBuilder());
		this.put("IFCTOPOLOGYREPRESENTATION", new IfcTopologyRepresentationBuilder());
		this.put("IFCCURVESTYLE", new IfcCurveStyleBuilder());
		this.put("IFCRELFLOWCONTROLELEMENTS", new IfcRelFlowControlElementsBuilder());
		this.put("IFCSTRUCTURALSURFACEMEMBERVARYING", new IfcStructuralSurfaceMemberVaryingBuilder());
		this.put("IFCLIBRARYREFERENCE", new IfcLibraryReferenceBuilder());
		this.put("IFCTENDONANCHORTYPE", new IfcTendonAnchorTypeBuilder());
		this.put("IFCCABLEFITTING", new IfcCableFittingBuilder());
		this.put("IFCRELFILLSELEMENT", new IfcRelFillsElementBuilder());
		this.put("IFCCURTAINWALLTYPE", new IfcCurtainWallTypeBuilder());
		this.put("IFCCREWRESOURCE", new IfcCrewResourceBuilder());
		this.put("IFCSWITCHINGDEVICE", new IfcSwitchingDeviceBuilder());
		this.put("IFCSLABTYPE", new IfcSlabTypeBuilder());
		this.put("IFCRELCONNECTSSTRUCTURALACTIVITY", new IfcRelConnectsStructuralActivityBuilder());
		this.put("IFCMATERIALPROFILESETUSAGETAPERING", new IfcMaterialProfileSetUsageTaperingBuilder());
		this.put("IFCRELCOVERSSPACES", new IfcRelCoversSpacesBuilder());
		this.put("IFCSECTIONREINFORCEMENTPROPERTIES", new IfcSectionReinforcementPropertiesBuilder());
		this.put("IFCSYSTEM", new IfcSystemBuilder());
		this.put("IFCWINDOWSTYLE", new IfcWindowStyleBuilder());
		this.put("IFCSENSORTYPE", new IfcSensorTypeBuilder());
		this.put("IFCMECHANICALFASTENERTYPE", new IfcMechanicalFastenerTypeBuilder());
		this.put("IFCGEOGRAPHICELEMENT", new IfcGeographicElementBuilder());
		this.put("IFCSTRUCTURALLOADGROUP", new IfcStructuralLoadGroupBuilder());
		this.put("IFCCONNECTIONSURFACEGEOMETRY", new IfcConnectionSurfaceGeometryBuilder());
		this.put("IFCPROTECTIVEDEVICETRIPPINGUNIT", new IfcProtectiveDeviceTrippingUnitBuilder());
		this.put("IFCMATERIALLIST", new IfcMaterialListBuilder());
		this.put("IFCRELNESTS", new IfcRelNestsBuilder());
		this.put("IFCTABLE", new IfcTableBuilder());
		this.put("IFCROUNDEDRECTANGLEPROFILEDEF", new IfcRoundedRectangleProfileDefBuilder());
		this.put("IFCGEOMETRICREPRESENTATIONCONTEXT", new IfcGeometricRepresentationContextBuilder());
		this.put("IFCRELCONNECTSPORTS", new IfcRelConnectsPortsBuilder());
		this.put("IFCSURFACECURVESWEPTAREASOLID", new IfcSurfaceCurveSweptAreaSolidBuilder());
		this.put("IFCRELASSIGNSTOACTOR", new IfcRelAssignsToActorBuilder());
		this.put("IFCSIUNIT", new IfcSIUnitBuilder());
		this.put("IFCAUDIOVISUALAPPLIANCETYPE", new IfcAudioVisualApplianceTypeBuilder());
		this.put("IFCRIGHTCIRCULARCONE", new IfcRightCircularConeBuilder());
		this.put("IFCFLOWINSTRUMENT", new IfcFlowInstrumentBuilder());
		this.put("IFCUNITARYCONTROLELEMENTTYPE", new IfcUnitaryControlElementTypeBuilder());
		this.put("IFCFLOWSTORAGEDEVICE", new IfcFlowStorageDeviceBuilder());
		this.put("IFCSTRUCTURALSURFACEMEMBER", new IfcStructuralSurfaceMemberBuilder());
		this.put("IFCFACETEDBREPWITHVOIDS", new IfcFacetedBrepWithVoidsBuilder());
		this.put("IFCTENDONTYPE", new IfcTendonTypeBuilder());
		this.put("IFCMATERIALLAYER", new IfcMaterialLayerBuilder());
		this.put("IFCPCURVE", new IfcPcurveBuilder());
		this.put("IFCSURFACEFEATURE", new IfcSurfaceFeatureBuilder());
		this.put("IFCEVAPORATOR", new IfcEvaporatorBuilder());
		this.put("IFCCONSTRUCTIONMATERIALRESOURCETYPE", new IfcConstructionMaterialResourceTypeBuilder());
		this.put("IFCMATERIALRELATIONSHIP", new IfcMaterialRelationshipBuilder());
		this.put("IFCFLOWMETER", new IfcFlowMeterBuilder());
		this.put("FILE_DESCRIPTION", new File_DescriptionBuilder());
		this.put("IFCFLOWFITTING", new IfcFlowFittingBuilder());
		this.put("IFCAPPLIEDVALUE", new IfcAppliedValueBuilder());
		this.put("IFCCOMMUNICATIONSAPPLIANCETYPE", new IfcCommunicationsApplianceTypeBuilder());
		this.put("IFCPIPEFITTINGTYPE", new IfcPipeFittingTypeBuilder());
		this.put("IFCENERGYCONVERSIONDEVICE", new IfcEnergyConversionDeviceBuilder());
		this.put("IFCLIGHTSOURCEDIRECTIONAL", new IfcLightSourceDirectionalBuilder());
		this.put("IFCVIRTUALGRIDINTERSECTION", new IfcVirtualGridIntersectionBuilder());
		this.put("IFCBURNER", new IfcBurnerBuilder());
		this.put("IFCACTIONREQUEST", new IfcActionRequestBuilder());
		this.put("IFCCABLECARRIERFITTING", new IfcCableCarrierFittingBuilder());
		this.put("IFCRECTANGULARTRIMMEDSURFACE", new IfcRectangularTrimmedSurfaceBuilder());
		this.put("IFCRELASSIGNSTORESOURCE", new IfcRelAssignsToResourceBuilder());
		this.put("IFCEDGELOOP", new IfcEdgeLoopBuilder());
		this.put("IFCCONNECTIONPOINTECCENTRICITY", new IfcConnectionPointEccentricityBuilder());
		this.put("IFCCOMPLEXPROPERTY", new IfcComplexPropertyBuilder());
		this.put("IFCEVAPORATIVECOOLER", new IfcEvaporativeCoolerBuilder());
		this.put("IFCSTRUCTURALLOADCASE", new IfcStructuralLoadCaseBuilder());
		this.put("IFCSYSTEMFURNITUREELEMENT", new IfcSystemFurnitureElementBuilder());
		this.put("IFCAPPLICATION", new IfcApplicationBuilder());
		this.put("IFCOPENSHELL", new IfcOpenShellBuilder());
		this.put("IFCTIMESERIESVALUE", new IfcTimeSeriesValueBuilder());
		this.put("IFCREINFORCINGMESHTYPE", new IfcReinforcingMeshTypeBuilder());
		this.put("IFCINTERCEPTOR", new IfcInterceptorBuilder());
		this.put("IFCBLOBTEXTURE", new IfcBlobTextureBuilder());
		this.put("IFCTUBEBUNDLE", new IfcTubeBundleBuilder());
		this.put("IFCCONSTRUCTIONEQUIPMENTRESOURCETYPE", new IfcConstructionEquipmentResourceTypeBuilder());
		this.put("IFCCURVESTYLEFONT", new IfcCurveStyleFontBuilder());
		this.put("IFCPRESENTATIONSTYLEASSIGNMENT", new IfcPresentationStyleAssignmentBuilder());
		this.put("IFCMAPPEDITEM", new IfcMappedItemBuilder());
		this.put("IFCCONSTRUCTIONPRODUCTRESOURCE", new IfcConstructionProductResourceBuilder());
		this.put("IFCPLANAREXTENT", new IfcPlanarExtentBuilder());
		this.put("IFCLSHAPEPROFILEDEF", new IfcLShapeProfileDefBuilder());
		this.put("IFCDAMPERTYPE", new IfcDamperTypeBuilder());
		this.put("IFCTEXTSTYLEFORDEFINEDFONT", new IfcTextStyleForDefinedFontBuilder());
		this.put("IFCMATERIALLAYERSET", new IfcMaterialLayerSetBuilder());
		this.put("IFCCOMMUNICATIONSAPPLIANCE", new IfcCommunicationsApplianceBuilder());
		this.put("IFCRESOURCETIME", new IfcResourceTimeBuilder());
		this.put("IFCTASKTIME", new IfcTaskTimeBuilder());
		this.put("IFCIMAGETEXTURE", new IfcImageTextureBuilder());
		this.put("IFCSURFACESTYLEWITHTEXTURES", new IfcSurfaceStyleWithTexturesBuilder());
		this.put("IFCVIRTUALELEMENT", new IfcVirtualElementBuilder());
		this.put("IFCACTOR", new IfcActorBuilder());
		this.put("IFCTANK", new IfcTankBuilder());
		this.put("IFCCIRCLEHOLLOWPROFILEDEF", new IfcCircleHollowProfileDefBuilder());
		this.put("IFCRELCONTAINEDINSPATIALSTRUCTURE", new IfcRelContainedInSpatialStructureBuilder());
		this.put("IFCPERMIT", new IfcPermitBuilder());
		this.put("IFCORGANIZATIONRELATIONSHIP", new IfcOrganizationRelationshipBuilder());
		this.put("IFCSTYLEDITEM", new IfcStyledItemBuilder());
		this.put("IFCRELASSIGNSTOPRODUCT", new IfcRelAssignsToProductBuilder());
		this.put("IFCDISCRETEACCESSORYTYPE", new IfcDiscreteAccessoryTypeBuilder());
		this.put("IFCPROPERTYENUMERATION", new IfcPropertyEnumerationBuilder());
		this.put("IFCPUMP", new IfcPumpBuilder());
		this.put("IFCCONSTRUCTIONPRODUCTRESOURCETYPE", new IfcConstructionProductResourceTypeBuilder());
		this.put("IFCTASKTIMERECURRING", new IfcTaskTimeRecurringBuilder());
		this.put("IFCFACE", new IfcFaceBuilder());
		this.put("IFCRELASSIGNSTOGROUP", new IfcRelAssignsToGroupBuilder());
		this.put("IFCPROCEDURE", new IfcProcedureBuilder());
		this.put("IFCSURFACESTYLERENDERING", new IfcSurfaceStyleRenderingBuilder());
		this.put("IFCDOOR", new IfcDoorBuilder());
		this.put("IFCSPACETYPE", new IfcSpaceTypeBuilder());
		this.put("IFCSTRUCTURALPOINTACTION", new IfcStructuralPointActionBuilder());
		this.put("IFCFACEBASEDSURFACEMODEL", new IfcFaceBasedSurfaceModelBuilder());
		this.put("IFCRAMPFLIGHT", new IfcRampFlightBuilder());
		this.put("IFCOWNERHISTORY", new IfcOwnerHistoryBuilder());
		this.put("IFCFIRESUPPRESSIONTERMINAL", new IfcFireSuppressionTerminalBuilder());
		this.put("FILE_NAME", new File_NameBuilder());
		this.put("IFCDOCUMENTINFORMATIONRELATIONSHIP", new IfcDocumentInformationRelationshipBuilder());
		this.put("IFCPILETYPE", new IfcPileTypeBuilder());
		this.put("IFCSHADINGDEVICE", new IfcShadingDeviceBuilder());
		this.put("IFCELECTRICDISTRIBUTIONBOARDTYPE", new IfcElectricDistributionBoardTypeBuilder());
		this.put("IFCRELVOIDSELEMENT", new IfcRelVoidsElementBuilder());
		this.put("IFCSTRUCTURALCURVEMEMBERVARYING", new IfcStructuralCurveMemberVaryingBuilder());
		this.put("IFCQUANTITYWEIGHT", new IfcQuantityWeightBuilder());
		this.put("IFCELEMENTASSEMBLY", new IfcElementAssemblyBuilder());
		this.put("IFCPROPERTYREFERENCEVALUE", new IfcPropertyReferenceValueBuilder());
		this.put("IFCFURNITURE", new IfcFurnitureBuilder());
		this.put("IFCLAMP", new IfcLampBuilder());
		this.put("IFCOCCUPANT", new IfcOccupantBuilder());
		this.put("IFCSTRUCTURALLOADCONFIGURATION", new IfcStructuralLoadConfigurationBuilder());
		this.put("IFCRELASSOCIATESCONSTRAINT", new IfcRelAssociatesConstraintBuilder());
		this.put("IFCFURNISHINGELEMENTTYPE", new IfcFurnishingElementTypeBuilder());
		this.put("IFCSPHERE", new IfcSphereBuilder());
		this.put("IFCBUILDINGELEMENTPROXY", new IfcBuildingElementProxyBuilder());
		this.put("IFCLIBRARYINFORMATION", new IfcLibraryInformationBuilder());
		this.put("IFCBOUNDINGBOX", new IfcBoundingBoxBuilder());
		this.put("IFCVERTEXLOOP", new IfcVertexLoopBuilder());
		this.put("IFCLIGHTSOURCEGONIOMETRIC", new IfcLightSourceGoniometricBuilder());
		this.put("IFCBOXEDHALFSPACE", new IfcBoxedHalfSpaceBuilder());
		this.put("IFCRATIONALBSPLINESURFACEWITHKNOTS", new IfcRationalBSplineSurfaceWithKnotsBuilder());
		this.put("IFCENGINE", new IfcEngineBuilder());
		this.put("IFCCSHAPEPROFILEDEF", new IfcCShapeProfileDefBuilder());
		this.put("IFCTEXTUREMAP", new IfcTextureMapBuilder());
		this.put("IFCCABLECARRIERSEGMENTTYPE", new IfcCableCarrierSegmentTypeBuilder());
		this.put("IFCTASK", new IfcTaskBuilder());
		this.put("IFCPLATE", new IfcPlateBuilder());
		this.put("IFCSPATIALZONETYPE", new IfcSpatialZoneTypeBuilder());
		this.put("IFCOUTLET", new IfcOutletBuilder());
		this.put("IFCFLOWTREATMENTDEVICE", new IfcFlowTreatmentDeviceBuilder());
		this.put("IFCSTAIRFLIGHT", new IfcStairFlightBuilder());
		this.put("IFCCURVEBOUNDEDSURFACE", new IfcCurveBoundedSurfaceBuilder());
		this.put("IFCSLAB", new IfcSlabBuilder());
		this.put("IFCDUCTFITTING", new IfcDuctFittingBuilder());
		this.put("IFCBSPLINECURVEWITHKNOTS", new IfcBSplineCurveWithKnotsBuilder());
		this.put("IFCAIRTERMINAL", new IfcAirTerminalBuilder());
		this.put("IFCORIENTEDEDGE", new IfcOrientedEdgeBuilder());
		this.put("IFCINTERCEPTORTYPE", new IfcInterceptorTypeBuilder());
		this.put("IFCDUCTSILENCERTYPE", new IfcDuctSilencerTypeBuilder());
		this.put("IFCRELASSOCIATESCLASSIFICATION", new IfcRelAssociatesClassificationBuilder());
		this.put("IFCCIRCLE", new IfcCircleBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEFORCEWARPING", new IfcStructuralLoadSingleForceWarpingBuilder());
		this.put("IFCARBITRARYPROFILEDEFWITHVOIDS", new IfcArbitraryProfileDefWithVoidsBuilder());
		this.put("IFCTEXTSTYLE", new IfcTextStyleBuilder());
		this.put("IFCCURTAINWALL", new IfcCurtainWallBuilder());
		this.put("IFCARBITRARYOPENPROFILEDEF", new IfcArbitraryOpenProfileDefBuilder());
		this.put("IFCMATERIALPROFILEWITHOFFSETS", new IfcMaterialProfileWithOffsetsBuilder());
		this.put("IFCACTUATORTYPE", new IfcActuatorTypeBuilder());
		this.put("IFCCONTEXTDEPENDENTUNIT", new IfcContextDependentUnitBuilder());
		this.put("IFCPROCEDURETYPE", new IfcProcedureTypeBuilder());
		this.put("IFCVERTEX", new IfcVertexBuilder());
		this.put("IFCCONTROLLER", new IfcControllerBuilder());
		this.put("IFCRELASSIGNSTOGROUPBYFACTOR", new IfcRelAssignsToGroupByFactorBuilder());
		this.put("IFCRAMP", new IfcRampBuilder());
		this.put("IFCTANKTYPE", new IfcTankTypeBuilder());
		this.put("IFCCURVEBOUNDEDPLANE", new IfcCurveBoundedPlaneBuilder());
		this.put("IFCWORKTIME", new IfcWorkTimeBuilder());
		this.put("IFCEDGE", new IfcEdgeBuilder());
		this.put("IFCANNOTATIONFILLAREA", new IfcAnnotationFillAreaBuilder());
		this.put("IFCSIMPLEPROPERTYTEMPLATE", new IfcSimplePropertyTemplateBuilder());
		this.put("IFCSTACKTERMINAL", new IfcStackTerminalBuilder());
		this.put("IFCUNITASSIGNMENT", new IfcUnitAssignmentBuilder());
		this.put("IFCCHIMNEY", new IfcChimneyBuilder());
		this.put("IFCVIBRATIONISOLATORTYPE", new IfcVibrationIsolatorTypeBuilder());
		this.put("IFCRELASSIGNSTOPROCESS", new IfcRelAssignsToProcessBuilder());
		this.put("IFCCARTESIANPOINTLIST3D", new IfcCartesianPointList3DBuilder());
		this.put("IFCRELCONNECTSELEMENTS", new IfcRelConnectsElementsBuilder());
		this.put("IFCELECTRICFLOWSTORAGEDEVICE", new IfcElectricFlowStorageDeviceBuilder());
		this.put("IFCCARTESIANPOINT", new IfcCartesianPointBuilder());
		this.put("IFCELLIPSEPROFILEDEF", new IfcEllipseProfileDefBuilder());
		this.put("IFCSHELLBASEDSURFACEMODEL", new IfcShellBasedSurfaceModelBuilder());
		this.put("IFCAIRTERMINALBOXTYPE", new IfcAirTerminalBoxTypeBuilder());
		this.put("IFCEXTERNALLYDEFINEDSURFACESTYLE", new IfcExternallyDefinedSurfaceStyleBuilder());
		this.put("IFCPLANE", new IfcPlaneBuilder());
		this.put("IFCRECURRENCEPATTERN", new IfcRecurrencePatternBuilder());
		this.put("IFCBOUNDARYFACECONDITION", new IfcBoundaryFaceConditionBuilder());
		this.put("IFCSTACKTERMINALTYPE", new IfcStackTerminalTypeBuilder());
		this.put("IFCLOCALPLACEMENT", new IfcLocalPlacementBuilder());
		this.put("IFCUNITARYEQUIPMENTTYPE", new IfcUnitaryEquipmentTypeBuilder());
		this.put("IFCDAMPER", new IfcDamperBuilder());
		this.put("IFCACTUATOR", new IfcActuatorBuilder());
		this.put("IFCBOUNDARYNODECONDITION", new IfcBoundaryNodeConditionBuilder());
		this.put("IFCCOSTSCHEDULE", new IfcCostScheduleBuilder());
		this.put("IFCRAILING", new IfcRailingBuilder());
		this.put("IFCCONNECTIONVOLUMEGEOMETRY", new IfcConnectionVolumeGeometryBuilder());
		this.put("IFCTASKTYPE", new IfcTaskTypeBuilder());
		this.put("IFCELECTRICDISTRIBUTIONBOARD", new IfcElectricDistributionBoardBuilder());
		this.put("IFCLIGHTSOURCEAMBIENT", new IfcLightSourceAmbientBuilder());
		this.put("IFCELECTRICMOTORTYPE", new IfcElectricMotorTypeBuilder());
		this.put("IFCTEXTLITERAL", new IfcTextLiteralBuilder());
		this.put("FILE_SCHEMA", new File_SchemaBuilder());
		this.put("IFCELEMENTQUANTITY", new IfcElementQuantityBuilder());
		this.put("IFCREGULARTIMESERIES", new IfcRegularTimeSeriesBuilder());
		this.put("IFCFOOTINGTYPE", new IfcFootingTypeBuilder());
		this.put("IFCPIPESEGMENT", new IfcPipeSegmentBuilder());
		this.put("IFCTENDON", new IfcTendonBuilder());
		this.put("IFCWALLTYPE", new IfcWallTypeBuilder());
		this.put("IFCPERSON", new IfcPersonBuilder());
		this.put("IFCWORKPLAN", new IfcWorkPlanBuilder());
		this.put("IFCFASTENERTYPE", new IfcFastenerTypeBuilder());
		this.put("IFCTELECOMADDRESS", new IfcTelecomAddressBuilder());
		this.put("IFCPROPERTYTABLEVALUE", new IfcPropertyTableValueBuilder());
		this.put("IFCIRREGULARTIMESERIESVALUE", new IfcIrregularTimeSeriesValueBuilder());
		this.put("IFCDOCUMENTINFORMATION", new IfcDocumentInformationBuilder());
		this.put("IFCREINFORCEMENTBARPROPERTIES", new IfcReinforcementBarPropertiesBuilder());
		this.put("IFCINDEXEDTRIANGLETEXTUREMAP", new IfcIndexedTriangleTextureMapBuilder());
		this.put("IFCSWEPTDISKSOLIDPOLYGONAL", new IfcSweptDiskSolidPolygonalBuilder());
		this.put("IFCMEDICALDEVICETYPE", new IfcMedicalDeviceTypeBuilder());
		this.put("IFCARBITRARYCLOSEDPROFILEDEF", new IfcArbitraryClosedProfileDefBuilder());
		this.put("IFCCLASSIFICATIONREFERENCE", new IfcClassificationReferenceBuilder());
		this.put("IFCMOTORCONNECTIONTYPE", new IfcMotorConnectionTypeBuilder());
		this.put("IFCTIMEPERIOD", new IfcTimePeriodBuilder());
		this.put("IFCWINDOW", new IfcWindowBuilder());
		this.put("IFCBOUNDARYEDGECONDITION", new IfcBoundaryEdgeConditionBuilder());
		this.put("IFCRELSERVICESBUILDINGS", new IfcRelServicesBuildingsBuilder());
		this.put("IFCCABLESEGMENTTYPE", new IfcCableSegmentTypeBuilder());
		this.put("IFCCOMPLEXPROPERTYTEMPLATE", new IfcComplexPropertyTemplateBuilder());
		this.put("IFCELECTRICAPPLIANCE", new IfcElectricApplianceBuilder());
		this.put("IFCMATERIALCONSTITUENTSET", new IfcMaterialConstituentSetBuilder());
		this.put("IFCREINFORCEMENTDEFINITIONPROPERTIES", new IfcReinforcementDefinitionPropertiesBuilder());
		this.put("IFCELECTRICTIMECONTROL", new IfcElectricTimeControlBuilder());
		this.put("IFCRELCOVERSBLDGELEMENTS", new IfcRelCoversBldgElementsBuilder());
		this.put("IFCCOLOURRGBLIST", new IfcColourRgbListBuilder());
		this.put("IFCSTRUCTURALSURFACEREACTION", new IfcStructuralSurfaceReactionBuilder());
		this.put("IFCPRESENTATIONLAYERASSIGNMENT", new IfcPresentationLayerAssignmentBuilder());
		this.put("IFCSTRUCTURALCURVEMEMBER", new IfcStructuralCurveMemberBuilder());
		this.put("IFCRECTANGULARPYRAMID", new IfcRectangularPyramidBuilder());
		this.put("IFCSHAPEREPRESENTATION", new IfcShapeRepresentationBuilder());
		this.put("IFCEDGECURVE", new IfcEdgeCurveBuilder());
		this.put("IFCCONNECTIONCURVEGEOMETRY", new IfcConnectionCurveGeometryBuilder());
		this.put("IFCPROTECTIVEDEVICETRIPPINGUNITTYPE", new IfcProtectiveDeviceTrippingUnitTypeBuilder());
		this.put("IFCPERFORMANCEHISTORY", new IfcPerformanceHistoryBuilder());
		this.put("IFCRELDEFINESBYTEMPLATE", new IfcRelDefinesByTemplateBuilder());
		this.put("IFCMATERIALDEFINITIONREPRESENTATION", new IfcMaterialDefinitionRepresentationBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEFORCE", new IfcStructuralLoadSingleForceBuilder());
		this.put("IFCCABLEFITTINGTYPE", new IfcCableFittingTypeBuilder());
		this.put("IFCCOOLEDBEAMTYPE", new IfcCooledBeamTypeBuilder());
		this.put("IFCTYPEPRODUCT", new IfcTypeProductBuilder());
		this.put("IFCLIGHTFIXTURE", new IfcLightFixtureBuilder());
		this.put("IFCRAILINGTYPE", new IfcRailingTypeBuilder());
		this.put("IFCGEOMETRICSET", new IfcGeometricSetBuilder());
		this.put("IFCRESOURCEAPPROVALRELATIONSHIP", new IfcResourceApprovalRelationshipBuilder());
		this.put("IFCDOORLININGPROPERTIES", new IfcDoorLiningPropertiesBuilder());
		this.put("IFCVOIDINGFEATURE", new IfcVoidingFeatureBuilder());
		this.put("IFCPROJECTLIBRARY", new IfcProjectLibraryBuilder());
		this.put("IFCCENTERLINEPROFILEDEF", new IfcCenterLineProfileDefBuilder());
		this.put("IFCDRAUGHTINGPREDEFINEDCURVEFONT", new IfcDraughtingPreDefinedCurveFontBuilder());
		this.put("IFCHEATEXCHANGER", new IfcHeatExchangerBuilder());
		this.put("IFCFAILURECONNECTIONCONDITION", new IfcFailureConnectionConditionBuilder());
		this.put("IFCCOLUMN", new IfcColumnBuilder());
		this.put("IFCPOINTONSURFACE", new IfcPointOnSurfaceBuilder());
		this.put("IFCSTRUCTURALPOINTREACTION", new IfcStructuralPointReactionBuilder());
		this.put("IFCSTRUCTURALSURFACECONNECTION", new IfcStructuralSurfaceConnectionBuilder());
		this.put("IFCSENSOR", new IfcSensorBuilder());
		this.put("IFCSPACEHEATERTYPE", new IfcSpaceHeaterTypeBuilder());
		this.put("IFCSTYLEDREPRESENTATION", new IfcStyledRepresentationBuilder());
		this.put("IFCELECTRICAPPLIANCETYPE", new IfcElectricApplianceTypeBuilder());
		this.put("IFCPOLYLINE", new IfcPolylineBuilder());
		this.put("IFCPROXY", new IfcProxyBuilder());
		this.put("IFCRATIONALBSPLINECURVEWITHKNOTS", new IfcRationalBSplineCurveWithKnotsBuilder());
		this.put("IFCELECTRICFLOWSTORAGEDEVICETYPE", new IfcElectricFlowStorageDeviceTypeBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEDISPLACEMENTDISTORTION", new IfcStructuralLoadSingleDisplacementDistortionBuilder());
		this.put("IFCUNITARYEQUIPMENT", new IfcUnitaryEquipmentBuilder());
		this.put("IFCFACEBOUND", new IfcFaceBoundBuilder());
		this.put("IFCBUILDINGELEMENTPARTTYPE", new IfcBuildingElementPartTypeBuilder());
		this.put("IFCANNOTATION", new IfcAnnotationBuilder());
		this.put("IFCSYSTEMFURNITUREELEMENTTYPE", new IfcSystemFurnitureElementTypeBuilder());
		this.put("IFCTRAPEZIUMPROFILEDEF", new IfcTrapeziumProfileDefBuilder());
		this.put("IFCFILLAREASTYLE", new IfcFillAreaStyleBuilder());
		this.put("IFCCONNECTIONPOINTGEOMETRY", new IfcConnectionPointGeometryBuilder());
		this.put("IFCHUMIDIFIERTYPE", new IfcHumidifierTypeBuilder());
		this.put("IFCCHILLER", new IfcChillerBuilder());
		this.put("IFCDISCRETEACCESSORY", new IfcDiscreteAccessoryBuilder());
		this.put("IFCWINDOWLININGPROPERTIES", new IfcWindowLiningPropertiesBuilder());
		this.put("IFCBUILDINGELEMENTPROXYTYPE", new IfcBuildingElementProxyTypeBuilder());
		this.put("IFCLABORRESOURCETYPE", new IfcLaborResourceTypeBuilder());
		this.put("IFCAIRTERMINALTYPE", new IfcAirTerminalTypeBuilder());
		this.put("IFCBSPLINESURFACEWITHKNOTS", new IfcBSplineSurfaceWithKnotsBuilder());
		this.put("IFCLOOP", new IfcLoopBuilder());
		this.put("IFCPUMPTYPE", new IfcPumpTypeBuilder());
		this.put("IFCFURNITURETYPE", new IfcFurnitureTypeBuilder());
		this.put("IFCPLANARBOX", new IfcPlanarBoxBuilder());
		this.put("IFCOBJECTIVE", new IfcObjectiveBuilder());
		this.put("IFCREVOLVEDAREASOLID", new IfcRevolvedAreaSolidBuilder());
		this.put("IFCRELPROJECTSELEMENT", new IfcRelProjectsElementBuilder());
		this.put("IFCWALL", new IfcWallBuilder());
		this.put("IFCCHIMNEYTYPE", new IfcChimneyTypeBuilder());
		this.put("IFCCOMPRESSORTYPE", new IfcCompressorTypeBuilder());
		this.put("IFCSWEPTDISKSOLID", new IfcSweptDiskSolidBuilder());
		this.put("IFCBEAMSTANDARDCASE", new IfcBeamStandardCaseBuilder());
		this.put("IFCELECTRICMOTOR", new IfcElectricMotorBuilder());
		this.put("IFCRESOURCECONSTRAINTRELATIONSHIP", new IfcResourceConstraintRelationshipBuilder());
		this.put("IFCTRANSPORTELEMENT", new IfcTransportElementBuilder());
		this.put("IFCMATERIALLAYERWITHOFFSETS", new IfcMaterialLayerWithOffsetsBuilder());
		this.put("IFCBUILDINGELEMENTPART", new IfcBuildingElementPartBuilder());
		this.put("IFCAXIS2PLACEMENT3D", new IfcAxis2Placement3DBuilder());
		this.put("IFCINDEXEDCOLOURMAP", new IfcIndexedColourMapBuilder());
		this.put("IFCCLASSIFICATION", new IfcClassificationBuilder());
		this.put("IFCFLOWMOVINGDEVICE", new IfcFlowMovingDeviceBuilder());
		this.put("IFCTEXTUREVERTEXLIST", new IfcTextureVertexListBuilder());
		this.put("IFCMETRIC", new IfcMetricBuilder());
		this.put("IFCLIGHTFIXTURETYPE", new IfcLightFixtureTypeBuilder());
		this.put("IFCUNITARYCONTROLELEMENT", new IfcUnitaryControlElementBuilder());
		this.put("IFCCABLECARRIERFITTINGTYPE", new IfcCableCarrierFittingTypeBuilder());
		this.put("IFCSTRUCTURALLINEARACTION", new IfcStructuralLinearActionBuilder());
		this.put("IFCGRIDPLACEMENT", new IfcGridPlacementBuilder());
		this.put("IFCDOORPANELPROPERTIES", new IfcDoorPanelPropertiesBuilder());
		this.put("IFCFLOWINSTRUMENTTYPE", new IfcFlowInstrumentTypeBuilder());
		this.put("IFCDISTRIBUTIONCHAMBERELEMENT", new IfcDistributionChamberElementBuilder());
		this.put("IFCDISTRIBUTIONPORT", new IfcDistributionPortBuilder());
		this.put("IFCCOOLINGTOWER", new IfcCoolingTowerBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR3D", new IfcCartesianTransformationOperator3DBuilder());
		this.put("IFCFASTENER", new IfcFastenerBuilder());
		this.put("IFCSTRUCTURALANALYSISMODEL", new IfcStructuralAnalysisModelBuilder());
		this.put("IFCWALLELEMENTEDCASE", new IfcWallElementedCaseBuilder());
		this.put("IFCGEOGRAPHICELEMENTTYPE", new IfcGeographicElementTypeBuilder());
		this.put("IFCSTRUCTURALCURVEREACTION", new IfcStructuralCurveReactionBuilder());
		this.put("IFCCLOSEDSHELL", new IfcClosedShellBuilder());
		this.put("IFCAXIS2PLACEMENT2D", new IfcAxis2Placement2DBuilder());
		this.put("IFCFLOWMETERTYPE", new IfcFlowMeterTypeBuilder());
		this.put("IFCWORKSCHEDULE", new IfcWorkScheduleBuilder());
		this.put("IFCCOOLINGTOWERTYPE", new IfcCoolingTowerTypeBuilder());
		this.put("IFCOUTLETTYPE", new IfcOutletTypeBuilder());
		this.put("IFCRELCONNECTSWITHREALIZINGELEMENTS", new IfcRelConnectsWithRealizingElementsBuilder());
		this.put("IFCFIXEDREFERENCESWEPTAREASOLID", new IfcFixedReferenceSweptAreaSolidBuilder());
		this.put("IFCSPATIALZONE", new IfcSpatialZoneBuilder());
		this.put("IFCDISTRIBUTIONFLOWELEMENT", new IfcDistributionFlowElementBuilder());
		this.put("IFCCOMPOSITEPROFILEDEF", new IfcCompositeProfileDefBuilder());
		this.put("IFCPROPERTYBOUNDEDVALUE", new IfcPropertyBoundedValueBuilder());
		this.put("IFCASYMMETRICISHAPEPROFILEDEF", new IfcAsymmetricIShapeProfileDefBuilder());
		this.put("IFCTRANSFORMER", new IfcTransformerBuilder());
		this.put("IFCQUANTITYLENGTH", new IfcQuantityLengthBuilder());
		this.put("IFCSLIPPAGECONNECTIONCONDITION", new IfcSlippageConnectionConditionBuilder());
		this.put("IFCZSHAPEPROFILEDEF", new IfcZShapeProfileDefBuilder());
		this.put("IFCCOILTYPE", new IfcCoilTypeBuilder());
		this.put("IFCPROPERTYSINGLEVALUE", new IfcPropertySingleValueBuilder());
		this.put("IFCBLOCK", new IfcBlockBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR2D", new IfcCartesianTransformationOperator2DBuilder());
		this.put("IFCPHYSICALCOMPLEXQUANTITY", new IfcPhysicalComplexQuantityBuilder());
		this.put("INTEGER", new INTEGERBuilder());
		this.put("DOUBLE", new DOUBLEBuilder());
		this.put("BOOLEAN", new BOOLEANBuilder());
		this.put("BINARY", new BINARYBuilder());
		this.put("REAL", new REALBuilder());
		this.put("STRING", new STRINGBuilder());
		this.put("LOGICAL", new LOGICALBuilder());
	}


static class IfcModulusOfSubgradeReactionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfSubgradeReactionMeasure();}}

static class IfcArithmeticOperatorEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArithmeticOperatorEnum();}}

static class IfcConstructionEquipmentResourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionEquipmentResourceTypeEnum();}}

static class IfcProjectionElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectionElementTypeEnum();}}

static class IfcWorkPlanTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkPlanTypeEnum();}}

static class IfcCondenserTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCondenserTypeEnum();}}

static class IfcPlateTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlateTypeEnum();}}

static class IfcElectricChargeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricChargeMeasure();}}

static class IfcMassFlowRateMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassFlowRateMeasure();}}

static class IfcPositiveLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPositiveLengthMeasure();}}

static class IfcCurveInterpolationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveInterpolationEnum();}}

static class IfcElementCompositionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementCompositionEnum();}}

static class IfcJunctionBoxTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcJunctionBoxTypeEnum();}}

static class IfcThermalResistanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalResistanceMeasure();}}

static class IfcSanitaryTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSanitaryTerminalTypeEnum();}}

static class IfcNormalisedRatioMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNormalisedRatioMeasure();}}

static class IfcVoidingFeatureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVoidingFeatureTypeEnum();}}

static class SchemaNameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new SchemaName();}}

static class IfcElectricTimeControlTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricTimeControlTypeEnum();}}

static class IfcPumpTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPumpTypeEnum();}}

static class IfcRotationalStiffnessMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRotationalStiffnessMeasure();}}

static class IfcEngineTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEngineTypeEnum();}}

static class IfcTimeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeMeasure();}}

static class IfcWindowTypePartitioningEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowTypePartitioningEnum();}}

static class IfcObjectiveEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcObjectiveEnum();}}

static class IfcSpecularRoughnessBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpecularRoughness();}}

static class IfcElectricCapacitanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricCapacitanceMeasure();}}

static class IfcMagneticFluxMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMagneticFluxMeasure();}}

static class IfcSolidAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSolidAngleMeasure();}}

static class IfcSIPrefixBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSIPrefix();}}

static class IfcGlobalOrLocalEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGlobalOrLocalEnum();}}

static class IfcDayInMonthNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDayInMonthNumber();}}

static class IfcPressureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPressureMeasure();}}

static class IfcBSplineCurveFormBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBSplineCurveForm();}}

static class IfcTextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcText();}}

static class IfcControllerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcControllerTypeEnum();}}

static class IfcTendonAnchorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonAnchorTypeEnum();}}

static class IfcWindowTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowTypeEnum();}}

static class IfcFontVariantBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFontVariant();}}

static class IfcChangeActionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChangeActionEnum();}}

static class IfcCableSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableSegmentTypeEnum();}}

static class IfcLuminousFluxMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLuminousFluxMeasure();}}

static class IfcMassDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassDensityMeasure();}}

static class IfcDoorStyleConstructionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStyleConstructionEnum();}}

static class IfcLampTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLampTypeEnum();}}

static class IfcReflectanceMethodEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReflectanceMethodEnum();}}

static class IfcRoleEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoleEnum();}}

static class IfcAreaDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAreaDensityMeasure();}}

static class IfcAssemblyPlaceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAssemblyPlaceEnum();}}

static class IfcElectricCurrentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricCurrentMeasure();}}

static class IfcCableFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableFittingTypeEnum();}}

static class IfcUnitaryControlElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryControlElementTypeEnum();}}

static class IfcDateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDate();}}

static class IfcCardinalPointReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCardinalPointReference();}}

static class IfcDataOriginEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDataOriginEnum();}}

static class IfcSpecificHeatCapacityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpecificHeatCapacityMeasure();}}

static class IfcDiscreteAccessoryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDiscreteAccessoryTypeEnum();}}

static class IfcDirectionSenseEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDirectionSenseEnum();}}

static class IfcTextPathBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextPath();}}

static class IfcElectricFlowStorageDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricFlowStorageDeviceTypeEnum();}}

static class IfcTorqueMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTorqueMeasure();}}

static class IfcOpeningElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpeningElementTypeEnum();}}

static class IfcWindowStyleOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStyleOperationEnum();}}

static class IfcAnalysisTheoryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnalysisTheoryTypeEnum();}}

static class IfcTransformerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransformerTypeEnum();}}

static class IfcFlowInstrumentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowInstrumentTypeEnum();}}

static class IfcSubContractResourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSubContractResourceTypeEnum();}}

static class IfcKinematicViscosityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcKinematicViscosityMeasure();}}

static class IfcElectricDistributionBoardTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricDistributionBoardTypeEnum();}}

static class IfcSurfaceFeatureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceFeatureTypeEnum();}}

static class IfcMechanicalFastenerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalFastenerTypeEnum();}}

static class IfcRampFlightTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampFlightTypeEnum();}}

static class IfcSpecularExponentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpecularExponent();}}

static class IfcUnitEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitEnum();}}

static class IfcElectricResistanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricResistanceMeasure();}}

static class IfcThermalConductivityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalConductivityMeasure();}}

static class IfcElectricMotorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricMotorTypeEnum();}}

static class IfcThermodynamicTemperatureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermodynamicTemperatureMeasure();}}

static class IfcDoorPanelOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorPanelOperationEnum();}}

static class IfcFontStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFontStyle();}}

static class IfcMomentOfInertiaMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMomentOfInertiaMeasure();}}

static class IfcWarpingMomentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWarpingMomentMeasure();}}

static class IfcSoundPowerLevelMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundPowerLevelMeasure();}}

static class IfcCountMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCountMeasure();}}

static class IfcIonConcentrationMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIonConcentrationMeasure();}}

static class IfcElectricConductanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricConductanceMeasure();}}

static class IfcPlaneAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlaneAngleMeasure();}}

static class IfcFireSuppressionTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFireSuppressionTerminalTypeEnum();}}

static class IfcMonthInYearNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMonthInYearNumber();}}

static class IfcFastenerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFastenerTypeEnum();}}

static class IfcBooleanOperatorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBooleanOperator();}}

static class IfcDoorTypeOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorTypeOperationEnum();}}

static class IfcAngularVelocityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAngularVelocityMeasure();}}

static class IfcDateTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDateTime();}}

static class IfcLogicalOperatorEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLogicalOperatorEnum();}}

static class IfcTaskTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTaskTypeEnum();}}

static class IfcStairTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairTypeEnum();}}

static class IfcLinearVelocityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearVelocityMeasure();}}

static class IfcCooledBeamTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCooledBeamTypeEnum();}}

static class IfcDescriptiveMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDescriptiveMeasure();}}

static class IfcElectricApplianceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricApplianceTypeEnum();}}

static class IfcVolumeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVolumeMeasure();}}

static class IfcIntegerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInteger();}}

static class IfcDuctSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSegmentTypeEnum();}}

static class IfcLoadGroupTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLoadGroupTypeEnum();}}

static class IfcSpaceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceTypeEnum();}}

static class IfcCrewResourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCrewResourceTypeEnum();}}

static class IfcSoundPowerMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundPowerMeasure();}}

static class IfcShearModulusMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShearModulusMeasure();}}

static class IfcFootingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFootingTypeEnum();}}

static class IfcSimplePropertyTemplateTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSimplePropertyTemplateTypeEnum();}}

static class IfcAirTerminalBoxTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalBoxTypeEnum();}}

static class IfcPipeFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeFittingTypeEnum();}}

static class IfcSpatialZoneTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpatialZoneTypeEnum();}}

static class IfcProcedureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProcedureTypeEnum();}}

static class IfcSwitchingDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSwitchingDeviceTypeEnum();}}

static class IfcBurnerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBurnerTypeEnum();}}

static class IfcFurnitureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnitureTypeEnum();}}

static class IfcBeamTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeamTypeEnum();}}

static class IfcShadingDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShadingDeviceTypeEnum();}}

static class IfcMotorConnectionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMotorConnectionTypeEnum();}}

static class IfcReinforcingBarSurfaceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBarSurfaceEnum();}}

static class IfcStructuralSurfaceMemberTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceMemberTypeEnum();}}

static class IfcUnitaryEquipmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryEquipmentTypeEnum();}}

static class IfcEnergyMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnergyMeasure();}}

static class IfcMolecularWeightMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMolecularWeightMeasure();}}

static class IfcThermalAdmittanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalAdmittanceMeasure();}}

static class IfcTextAlignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextAlignment();}}

static class IfcKnotTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcKnotType();}}

static class IfcConstructionMaterialResourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionMaterialResourceTypeEnum();}}

static class IfcHeatExchangerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatExchangerTypeEnum();}}

static class IfcInductanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInductanceMeasure();}}

static class IfcFlowDirectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowDirectionEnum();}}

static class IfcAmountOfSubstanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAmountOfSubstanceMeasure();}}

static class IfcCoilTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoilTypeEnum();}}

static class IfcPowerMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPowerMeasure();}}

static class IfcNullStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNullStyle();}}

static class IfcAnalysisModelTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnalysisModelTypeEnum();}}

static class IfcSensorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSensorTypeEnum();}}

static class IfcAlarmTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAlarmTypeEnum();}}

static class IfcPerformanceHistoryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPerformanceHistoryTypeEnum();}}

static class IfcDoseEquivalentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoseEquivalentMeasure();}}

static class IfcComplexPropertyTemplateTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcComplexPropertyTemplateTypeEnum();}}

static class IfcInventoryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInventoryTypeEnum();}}

static class IfcRailingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRailingTypeEnum();}}

static class IfcReinforcingBarRoleEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBarRoleEnum();}}

static class IfcPresentableTextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentableText();}}

static class IfcTransportElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransportElementTypeEnum();}}

static class IfcCompressorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompressorTypeEnum();}}

static class IfcRampTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampTypeEnum();}}

static class IfcSoundPressureLevelMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundPressureLevelMeasure();}}

static class IfcTaskDurationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTaskDurationEnum();}}

static class IfcRoofTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoofTypeEnum();}}

static class IfcPropertySetTemplateTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySetTemplateTypeEnum();}}

static class IfcPositivePlaneAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPositivePlaneAngleMeasure();}}

static class IfcParameterValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcParameterValue();}}

static class IfcWindowPanelPositionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowPanelPositionEnum();}}

static class IfcLogicalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLogical();}}

static class IfcMedicalDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMedicalDeviceTypeEnum();}}

static class IfcColumnTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumnTypeEnum();}}

static class IfcModulusOfElasticityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfElasticityMeasure();}}

static class IfcAirToAirHeatRecoveryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirToAirHeatRecoveryTypeEnum();}}

static class IfcDocumentConfidentialityEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentConfidentialityEnum();}}

static class IfcModulusOfRotationalSubgradeReactionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfRotationalSubgradeReactionMeasure();}}

static class IfcOccupantTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOccupantTypeEnum();}}

static class IfcContextDependentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcContextDependentMeasure();}}

static class IfcVaporPermeabilityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVaporPermeabilityMeasure();}}

static class IfcLayerSetDirectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLayerSetDirectionEnum();}}

static class IfcChillerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChillerTypeEnum();}}

static class IfcURIReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcURIReference();}}

static class IfcTendonTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonTypeEnum();}}

static class IfcEventTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEventTypeEnum();}}

static class IfcSequenceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSequenceEnum();}}

static class IfcIntegerCountRateMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIntegerCountRateMeasure();}}

static class IfcProfileTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProfileTypeEnum();}}

static class IfcRecurrenceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRecurrenceTypeEnum();}}

static class IfcRatioMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRatioMeasure();}}

static class IfcTrimmingPreferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTrimmingPreference();}}

static class IfcBSplineSurfaceFormBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBSplineSurfaceForm();}}

static class IfcDocumentStatusEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentStatusEnum();}}

static class IfcStateEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStateEnum();}}

static class IfcWindowStyleConstructionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStyleConstructionEnum();}}

static class IfcPhysicalOrVirtualEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPhysicalOrVirtualEnum();}}

static class IfcVolumetricFlowRateMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVolumetricFlowRateMeasure();}}

static class IfcCompoundPlaneAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompoundPlaneAngleMeasure();}}

static class IfcCoolingTowerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoolingTowerTypeEnum();}}

static class IfcTimeStampBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeStamp();}}

static class IfcComplexNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcComplexNumber();}}

static class IfcTubeBundleTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTubeBundleTypeEnum();}}

static class IfcActionSourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionSourceTypeEnum();}}

static class IfcDistributionPortTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionPortTypeEnum();}}

static class IfcLuminousIntensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLuminousIntensityMeasure();}}

static class IfcLinearForceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearForceMeasure();}}

static class IfcWorkCalendarTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkCalendarTypeEnum();}}

static class IfcProjectOrderTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectOrderTypeEnum();}}

static class IfcTextFontNameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextFontName();}}

static class TimeStampTextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new TimeStampText();}}

static class IfcRadioActivityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRadioActivityMeasure();}}

static class IfcMemberTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMemberTypeEnum();}}

static class IfcActuatorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActuatorTypeEnum();}}

static class IfcRotationalFrequencyMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRotationalFrequencyMeasure();}}

static class IfcElementAssemblyTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementAssemblyTypeEnum();}}

static class IfcWallTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallTypeEnum();}}

static class IfcSurfaceSideBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceSide();}}

static class IfcForceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcForceMeasure();}}

static class IfcFlowMeterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMeterTypeEnum();}}

static class IfcGridTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGridTypeEnum();}}

static class IfcSoundPressureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundPressureMeasure();}}

static class IfcConstructionProductResourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionProductResourceTypeEnum();}}

static class IfcTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTime();}}

static class IfcAccelerationMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAccelerationMeasure();}}

static class IfcWorkScheduleTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkScheduleTypeEnum();}}

static class IfcFrequencyMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFrequencyMeasure();}}

static class IfcBenchmarkEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBenchmarkEnum();}}

static class IfcLabelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLabel();}}

static class IfcDuctSilencerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSilencerTypeEnum();}}

static class IfcFontWeightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFontWeight();}}

static class IfcPropertySetDefinitionSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySetDefinitionSet();}}

static class IfcWindowPanelOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowPanelOperationEnum();}}

static class IfcCostItemTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostItemTypeEnum();}}

static class IfcEvaporativeCoolerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporativeCoolerTypeEnum();}}

static class IfcFilterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFilterTypeEnum();}}

static class IfcPositiveRatioMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPositiveRatioMeasure();}}

static class IfcTextTransformationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextTransformation();}}

static class IfcTemperatureRateOfChangeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTemperatureRateOfChangeMeasure();}}

static class IfcProtectiveDeviceTrippingUnitTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceTrippingUnitTypeEnum();}}

static class IfcMonetaryMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMonetaryMeasure();}}

static class IfcIlluminanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIlluminanceMeasure();}}

static class IfcCurvatureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurvatureMeasure();}}

static class IfcMagneticFluxDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMagneticFluxDensityMeasure();}}

static class IfcHumidifierTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHumidifierTypeEnum();}}

static class IfcReinforcingMeshTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingMeshTypeEnum();}}

static class IfcPHMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPHMeasure();}}

static class IfcAudioVisualApplianceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAudioVisualApplianceTypeEnum();}}

static class IfcHeatFluxDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatFluxDensityMeasure();}}

static class IfcConnectionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionTypeEnum();}}

static class IfcGeographicElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeographicElementTypeEnum();}}

static class IfcMassMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassMeasure();}}

static class IfcEvaporatorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporatorTypeEnum();}}

static class IfcDoorPanelPositionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorPanelPositionEnum();}}

static class IfcSectionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionTypeEnum();}}

static class IfcSIUnitNameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSIUnitName();}}

static class IfcWasteTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWasteTerminalTypeEnum();}}

static class IfcLightEmissionSourceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightEmissionSourceEnum();}}

static class IfcLightFixtureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightFixtureTypeEnum();}}

static class IfcBuildingElementProxyTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementProxyTypeEnum();}}

static class IfcDurationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuration();}}

static class IfcPileTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPileTypeEnum();}}

static class IfcDayInWeekNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDayInWeekNumber();}}

static class IfcLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLengthMeasure();}}

static class IfcRealBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReal();}}

static class IfcCurtainWallTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurtainWallTypeEnum();}}

static class IfcDynamicViscosityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDynamicViscosityMeasure();}}

static class IfcExternalSpatialElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternalSpatialElementTypeEnum();}}

static class IfcSectionModulusMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionModulusMeasure();}}

static class IfcRotationalMassMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRotationalMassMeasure();}}

static class IfcStructuralCurveActivityTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveActivityTypeEnum();}}

static class IfcInternalOrExternalEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInternalOrExternalEnum();}}

static class IfcObjectTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcObjectTypeEnum();}}

static class IfcChimneyTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChimneyTypeEnum();}}

static class IfcFanTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFanTypeEnum();}}

static class IfcAddressTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAddressTypeEnum();}}

static class IfcDistributionChamberElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionChamberElementTypeEnum();}}

static class IfcLaborResourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLaborResourceTypeEnum();}}

static class IfcGeometricProjectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricProjectionEnum();}}

static class IfcDuctFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctFittingTypeEnum();}}

static class IfcSlabTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlabTypeEnum();}}

static class IfcProjectedOrTrueLengthEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectedOrTrueLengthEnum();}}

static class IfcDoorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorTypeEnum();}}

static class IfcAreaMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAreaMeasure();}}

static class IfcLanguageIdBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLanguageId();}}

static class IfcMassPerLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassPerLengthMeasure();}}

static class IfcStructuralCurveMemberTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveMemberTypeEnum();}}

static class IfcBuildingElementPartTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementPartTypeEnum();}}

static class IfcIdentifierBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIdentifier();}}

static class IfcLinearStiffnessMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearStiffnessMeasure();}}

static class IfcLightDistributionCurveEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightDistributionCurveEnum();}}

static class IfcTimeSeriesDataTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesDataTypeEnum();}}

static class IfcMoistureDiffusivityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMoistureDiffusivityMeasure();}}

static class IfcSystemFurnitureElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSystemFurnitureElementTypeEnum();}}

static class IfcLuminousIntensityDistributionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLuminousIntensityDistributionMeasure();}}

static class IfcDoorStyleOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStyleOperationEnum();}}

static class IfcModulusOfLinearSubgradeReactionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfLinearSubgradeReactionMeasure();}}

static class IfcSpaceHeaterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceHeaterTypeEnum();}}

static class IfcBooleanBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoolean();}}

static class IfcTankTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTankTypeEnum();}}

static class IfcSectionalAreaIntegralMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionalAreaIntegralMeasure();}}

static class IfcDamperTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDamperTypeEnum();}}

static class IfcCableCarrierSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierSegmentTypeEnum();}}

static class IfcPileConstructionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPileConstructionEnum();}}

static class IfcCableCarrierFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierFittingTypeEnum();}}

static class IfcDimensionCountBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionCount();}}

static class IfcPermeableCoveringOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermeableCoveringOperationEnum();}}

static class IfcDerivedUnitEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedUnitEnum();}}

static class IfcPipeSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeSegmentTypeEnum();}}

static class IfcGloballyUniqueIdBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGloballyUniqueId();}}

static class IfcAirTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalTypeEnum();}}

static class IfcIsothermalMoistureCapacityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIsothermalMoistureCapacityMeasure();}}

static class IfcReinforcingBarTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBarTypeEnum();}}

static class IfcNonNegativeLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNonNegativeLengthMeasure();}}

static class IfcNumericMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNumericMeasure();}}

static class IfcConstraintEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstraintEnum();}}

static class IfcBuildingSystemTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingSystemTypeEnum();}}

static class IfcProtectiveDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceTypeEnum();}}

static class IfcOutletTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOutletTypeEnum();}}

static class IfcHeatingValueMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatingValueMeasure();}}

static class IfcCoveringTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoveringTypeEnum();}}

static class IfcWarpingConstantMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWarpingConstantMeasure();}}

static class IfcValveTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcValveTypeEnum();}}

static class IfcBoxAlignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoxAlignment();}}

static class IfcStackTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStackTerminalTypeEnum();}}

static class IfcSolarDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSolarDeviceTypeEnum();}}

static class IfcLinearMomentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearMomentMeasure();}}

static class IfcEventTriggerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEventTriggerTypeEnum();}}

static class IfcVibrationIsolatorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVibrationIsolatorTypeEnum();}}

static class IfcDistributionSystemEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionSystemEnum();}}

static class IfcActionRequestTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionRequestTypeEnum();}}

static class IfcElectricVoltageMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricVoltageMeasure();}}

static class IfcThermalExpansionCoefficientMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalExpansionCoefficientMeasure();}}

static class IfcPlanarForceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlanarForceMeasure();}}

static class IfcInterceptorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInterceptorTypeEnum();}}

static class IfcAbsorbedDoseMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAbsorbedDoseMeasure();}}

static class IfcCostScheduleTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostScheduleTypeEnum();}}

static class IfcThermalTransmittanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalTransmittanceMeasure();}}

static class IfcBoilerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoilerTypeEnum();}}

static class IfcTemperatureGradientMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTemperatureGradientMeasure();}}

static class IfcElectricGeneratorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricGeneratorTypeEnum();}}

static class IfcTextDecorationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextDecoration();}}

static class IfcTransitionCodeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransitionCode();}}

static class IfcStairFlightTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairFlightTypeEnum();}}

static class IfcActionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionTypeEnum();}}

static class IfcCommunicationsApplianceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCommunicationsApplianceTypeEnum();}}

static class IfcStructuralSurfaceActivityTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceActivityTypeEnum();}}

static class IfcPermitTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermitTypeEnum();}}

static class IfcDirectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDirection();}}

static class IfcJunctionBoxTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcJunctionBoxType();}}

static class IfcFireSuppressionTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFireSuppressionTerminalType();}}

static class IfcReinforcingBarBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBar();}}

static class IfcFanBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFan();}}

static class IfcDuctSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSegmentType();}}

static class IfcTypeObjectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTypeObject();}}

static class IfcFaceSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceSurface();}}

static class IfcCircleProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCircleProfileDef();}}

static class IfcSubContractResourceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSubContractResourceType();}}

static class IfcGeometricCurveSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricCurveSet();}}

static class IfcFanTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFanType();}}

static class IfcCooledBeamBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCooledBeam();}}

static class IfcEvaporativeCoolerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporativeCoolerType();}}

static class IfcRelDefinesByObjectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDefinesByObject();}}

static class IfcEllipseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEllipse();}}

static class IfcPolygonalBoundedHalfSpaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPolygonalBoundedHalfSpace();}}

static class IfcSectionedSpineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionedSpine();}}

static class IfcGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGroup();}}

static class IfcPolyLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPolyLoop();}}

static class IfcCompressorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompressor();}}

static class IfcBoilerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoiler();}}

static class IfcDraughtingPreDefinedColourBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingPreDefinedColour();}}

static class IfcHumidifierBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHumidifier();}}

static class IfcSurfaceStyleShadingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleShading();}}

static class IfcAdvancedBrepWithVoidsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAdvancedBrepWithVoids();}}

static class IfcSolarDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSolarDevice();}}

static class IfcOrganizationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrganization();}}

static class IfcMaterialProfileBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialProfile();}}

static class IfcQuantityTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityTime();}}

static class IfcTriangulatedFaceSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTriangulatedFaceSet();}}

static class IfcHeatExchangerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatExchangerType();}}

static class IfcRelConnectsWithEccentricityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsWithEccentricity();}}

static class IfcColumnTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumnType();}}

static class IfcProductDefinitionShapeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProductDefinitionShape();}}

static class IfcActorRoleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActorRole();}}

static class IfcTableRowBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTableRow();}}

static class IfcVertexPointBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertexPoint();}}

static class IfcMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMember();}}

static class IfcRelSpaceBoundaryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSpaceBoundary();}}

static class IfcWindowStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStandardCase();}}

static class IfcMaterialClassificationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialClassificationRelationship();}}

static class IfcCondenserTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCondenserType();}}

static class IfcChillerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChillerType();}}

static class IfcCivilElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCivilElementType();}}

static class IfcMaterialLayerSetUsageBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayerSetUsage();}}

static class IfcReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReference();}}

static class IfcConstructionEquipmentResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionEquipmentResource();}}

static class IfcAlarmTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAlarmType();}}

static class IfcAlarmBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAlarm();}}

static class IfcTubeBundleTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTubeBundleType();}}

static class IfcAssetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAsset();}}

static class IfcWorkCalendarBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkCalendar();}}

static class IfcCurrencyRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurrencyRelationship();}}

static class IfcCivilElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCivilElement();}}

static class IfcSlabStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlabStandardCase();}}

static class IfcPointOnCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPointOnCurve();}}

static class IfcCylindricalSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCylindricalSurface();}}

static class IfcRelConnectsStructuralMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsStructuralMember();}}

static class IfcElementAssemblyTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementAssemblyType();}}

static class IfcDimensionalExponentsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionalExponents();}}

static class IfcRampFlightTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampFlightType();}}

static class IfcDerivedUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedUnit();}}

static class IfcCurveStyleFontAndScalingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyleFontAndScaling();}}

static class IfcRevolvedAreaSolidTaperedBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRevolvedAreaSolidTapered();}}

static class IfcFaceOuterBoundBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceOuterBound();}}

static class IfcPipeFittingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeFitting();}}

static class IfcOpeningElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpeningElement();}}

static class IfcLightSourcePositionalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourcePositional();}}

static class IfcAirToAirHeatRecoveryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirToAirHeatRecovery();}}

static class IfcRelDefinesByTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDefinesByType();}}

static class IfcSubContractResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSubContractResource();}}

static class IfcSurfaceStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyle();}}

static class IfcLaborResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLaborResource();}}

static class IfcCostItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostItem();}}

static class IfcCoilBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoil();}}

static class IfcRelSpaceBoundary1stLevelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSpaceBoundary1stLevel();}}

static class IfcControllerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcControllerType();}}

static class IfcTendonAnchorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonAnchor();}}

static class IfcExternalSpatialElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternalSpatialElement();}}

static class IfcTransformerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransformerType();}}

static class IfcRelAssignsToControlBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToControl();}}

static class IfcSubedgeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSubedge();}}

static class IfcDistributionChamberElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionChamberElementType();}}

static class IfcValveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcValve();}}

static class IfcQuantityCountBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityCount();}}

static class IfcColumnStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumnStandardCase();}}

static class IfcRelAssociatesApprovalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesApproval();}}

static class IfcCoveringTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoveringType();}}

static class IfcLineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLine();}}

static class IfcStructuralLoadPlanarForceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadPlanarForce();}}

static class IfcSanitaryTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSanitaryTerminalType();}}

static class IfcLightDistributionDataBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightDistributionData();}}

static class IfcWasteTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWasteTerminalType();}}

static class IfcFillAreaStyleTilesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyleTiles();}}

static class IfcDuctFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctFittingType();}}

static class IfcSurfaceStyleLightingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleLighting();}}

static class IfcSiteBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSite();}}

static class IfcDuctSilencerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSilencer();}}

static class IfcTrimmedCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTrimmedCurve();}}

static class IfcColourRgbBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColourRgb();}}

static class IfcRelAssociatesMaterialBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesMaterial();}}

static class IfcElectricGeneratorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricGeneratorType();}}

static class IfcDuctSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSegment();}}

static class IfcPileBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPile();}}

static class IfcDistributionSystemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionSystem();}}

static class IfcMaterialBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterial();}}

static class IfcRelSpaceBoundary2ndLevelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSpaceBoundary2ndLevel();}}

static class IfcWallStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallStandardCase();}}

static class IfcReparametrisedCompositeCurveSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReparametrisedCompositeCurveSegment();}}

static class IfcBeamBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeam();}}

static class IfcOffsetCurve3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOffsetCurve3D();}}

static class IfcApprovalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApproval();}}

static class IfcIShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIShapeProfileDef();}}

static class IfcDistributionElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionElementType();}}

static class IfcValveTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcValveType();}}

static class IfcExtrudedAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExtrudedAreaSolid();}}

static class IfcConversionBasedUnitWithOffsetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConversionBasedUnitWithOffset();}}

static class IfcRelInterferesElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelInterferesElements();}}

static class IfcTextureCoordinateGeneratorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureCoordinateGenerator();}}

static class IfcPropertySetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySet();}}

static class IfcProtectiveDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceType();}}

static class IfcOffsetCurve2DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOffsetCurve2D();}}

static class IfcSlabElementedCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlabElementedCase();}}

static class IfcCableSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableSegment();}}

static class IfcBoundaryNodeConditionWarpingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryNodeConditionWarping();}}

static class IfcPropertySetTemplateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySetTemplate();}}

static class IfcReinforcingMeshBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingMesh();}}

static class IfcZoneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcZone();}}

static class IfcDistributionCircuitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionCircuit();}}

static class IfcStairFlightTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairFlightType();}}

static class IfcMemberTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMemberType();}}

static class IfcTextureVertexBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureVertex();}}

static class IfcStairTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairType();}}

static class IfcMeasureWithUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMeasureWithUnit();}}

static class IfcMonetaryUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMonetaryUnit();}}

static class IfcQuantityAreaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityArea();}}

static class IfcTextLiteralWithExtentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextLiteralWithExtent();}}

static class IfcSurfaceReinforcementAreaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceReinforcementArea();}}

static class IfcRelAggregatesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAggregates();}}

static class IfcCompositeCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeCurve();}}

static class IfcTextStyleFontModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleFontModel();}}

static class IfcPropertyEnumeratedValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyEnumeratedValue();}}

static class IfcMaterialProfileSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialProfileSet();}}

static class IfcBuildingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuilding();}}

static class IfcConversionBasedUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConversionBasedUnit();}}

static class IfcSwitchingDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSwitchingDeviceType();}}

static class IfcPlateTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlateType();}}

static class IfcDoorStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStyle();}}

static class IfcProjectOrderBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectOrder();}}

static class IfcSpaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpace();}}

static class IfcWindowTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowType();}}

static class IfcBuildingSystemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingSystem();}}

static class IfcStructuralCurveActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveAction();}}

static class IfcSurfaceStyleRefractionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleRefraction();}}

static class IfcFlowSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowSegment();}}

static class IfcSurfaceOfLinearExtrusionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceOfLinearExtrusion();}}

static class IfcTransportElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransportElementType();}}

static class IfcRectangleHollowProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangleHollowProfileDef();}}

static class IfcDistributionElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionElement();}}

static class IfcMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialProperties();}}

static class IfcAdvancedBrepBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAdvancedBrep();}}

static class IfcFilterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFilterType();}}

static class IfcExternallyDefinedTextFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedTextFont();}}

static class IfcStructuralPointConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPointConnection();}}

static class IfcCartesianTransformationOperator3DnonUniformBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator3DnonUniform();}}

static class IfcQuantityVolumeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityVolume();}}

static class IfcRepresentationMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRepresentationMap();}}

static class IfcStructuralCurveConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveConnection();}}

static class IfcGridAxisBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGridAxis();}}

static class IfcBooleanResultBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBooleanResult();}}

static class IfcPipeSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeSegmentType();}}

static class IfcExtrudedAreaSolidTaperedBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExtrudedAreaSolidTapered();}}

static class IfcTableColumnBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTableColumn();}}

static class IfcMedicalDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMedicalDevice();}}

static class IfcPermeableCoveringPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermeableCoveringProperties();}}

static class IfcAxis1PlacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAxis1Placement();}}

static class IfcRelDeclaresBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDeclares();}}

static class IfcDerivedUnitElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedUnitElement();}}

static class IfcOpeningStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpeningStandardCase();}}

static class IfcCsgSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCsgSolid();}}

static class IfcFacetedBrepBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFacetedBrep();}}

static class IfcRelConnectsPortToElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsPortToElement();}}

static class IfcDerivedProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedProfileDef();}}

static class IfcBurnerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBurnerType();}}

static class IfcWasteTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWasteTerminal();}}

static class IfcProjectedCRSBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectedCRS();}}

static class IfcStructuralLoadLinearForceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadLinearForce();}}

static class IfcRelDefinesByPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDefinesByProperties();}}

static class IfcPixelTextureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPixelTexture();}}

static class IfcStairBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStair();}}

static class IfcTextStyleTextModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleTextModel();}}

static class IfcEngineTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEngineType();}}

static class IfcSanitaryTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSanitaryTerminal();}}

static class IfcCondenserBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCondenser();}}

static class IfcDoorStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStandardCase();}}

static class IfcMemberStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMemberStandardCase();}}

static class IfcStructuralLoadSingleDisplacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleDisplacement();}}

static class IfcCrewResourceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCrewResourceType();}}

static class IfcWindowPanelPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowPanelProperties();}}

static class IfcAudioVisualApplianceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAudioVisualAppliance();}}

static class IfcElectricTimeControlTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricTimeControlType();}}

static class IfcEvaporatorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporatorType();}}

static class IfcAirToAirHeatRecoveryTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirToAirHeatRecoveryType();}}

static class IfcMirroredProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMirroredProfileDef();}}

static class IfcPropertyListValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyListValue();}}

static class IfcSolarDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSolarDeviceType();}}

static class IfcBooleanClippingResultBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBooleanClippingResult();}}

static class IfcEventTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEventType();}}

static class IfcAdvancedFaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAdvancedFace();}}

static class IfcCoveringBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCovering();}}

static class IfcAirTerminalBoxBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalBox();}}

static class IfcPropertyDependencyRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyDependencyRelationship();}}

static class IfcApprovalRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApprovalRelationship();}}

static class IfcStructuralResultGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralResultGroup();}}

static class IfcBeamTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeamType();}}

static class IfcCableCarrierSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierSegment();}}

static class IfcRectangleProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangleProfileDef();}}

static class IfcCurveStyleFontPatternBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyleFontPattern();}}

static class IfcLightIntensityDistributionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightIntensityDistribution();}}

static class IfcLampTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLampType();}}

static class IfcBoundaryCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryCurve();}}

static class IfcPathBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPath();}}

static class IfcEventTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEventTime();}}

static class IfcExternallyDefinedHatchStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedHatchStyle();}}

static class IfcExternalReferenceRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternalReferenceRelationship();}}

static class IfcSectionPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionProperties();}}

static class IfcGeometricRepresentationSubContextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricRepresentationSubContext();}}

static class IfcBoilerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoilerType();}}

static class IfcRelReferencedInSpatialStructureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelReferencedInSpatialStructure();}}

static class IfcMaterialProfileSetUsageBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialProfileSetUsage();}}

static class IfcRelAssociatesDocumentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesDocument();}}

static class IfcPresentationLayerWithStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentationLayerWithStyle();}}

static class IfcFlowControllerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowController();}}

static class IfcRoofBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoof();}}

static class IfcVectorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVector();}}

static class IfcHalfSpaceSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHalfSpaceSolid();}}

static class IfcFurnishingElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnishingElement();}}

static class IfcSpaceHeaterBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceHeater();}}

static class IfcMotorConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMotorConnection();}}

static class IfcReinforcingBarTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBarType();}}

static class IfcOuterBoundaryCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOuterBoundaryCurve();}}

static class IfcProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProfileDef();}}

static class IfcPostalAddressBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPostalAddress();}}

static class IfcFlowTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowTerminal();}}

static class IfcCompositeCurveOnSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeCurveOnSurface();}}

static class IfcShadingDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShadingDeviceType();}}

static class IfcElectricGeneratorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricGenerator();}}

static class IfcProjectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProject();}}

static class IfcEventBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvent();}}

static class IfcDocumentReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentReference();}}

static class IfcRelAssociatesLibraryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesLibrary();}}

static class IfcBuildingStoreyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingStorey();}}

static class IfcRampTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampType();}}

static class IfcCartesianTransformationOperator2DnonUniformBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator2DnonUniform();}}

static class IfcMechanicalFastenerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalFastener();}}

static class IfcProjectionElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectionElement();}}

static class IfcRelSequenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSequence();}}

static class IfcVibrationIsolatorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVibrationIsolator();}}

static class IfcFootingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFooting();}}

static class IfcConnectedFaceSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectedFaceSet();}}

static class IfcProfilePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProfileProperties();}}

static class IfcLightSourceSpotBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceSpot();}}

static class IfcDoorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorType();}}

static class IfcProtectiveDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDevice();}}

static class IfcMapConversionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMapConversion();}}

static class IfcStructuralPlanarActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPlanarAction();}}

static class IfcPersonAndOrganizationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPersonAndOrganization();}}

static class IfcUShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUShapeProfileDef();}}

static class IfcRoofTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoofType();}}

static class IfcFilterBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFilter();}}

static class IfcSurfaceOfRevolutionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceOfRevolution();}}

static class IfcStructuralLoadTemperatureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadTemperature();}}

static class IfcCostValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostValue();}}

static class IfcRightCircularCylinderBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRightCircularCylinder();}}

static class IfcFillAreaStyleHatchingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyleHatching();}}

static class IfcPlateStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlateStandardCase();}}

static class IfcShapeAspectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShapeAspect();}}

static class IfcStructuralSurfaceActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceAction();}}

static class IfcIrregularTimeSeriesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIrregularTimeSeries();}}

static class IfcConstructionMaterialResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionMaterialResource();}}

static class IfcRelConnectsPathElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsPathElements();}}

static class IfcCompositeCurveSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeCurveSegment();}}

static class IfcJunctionBoxBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcJunctionBox();}}

static class IfcDistributionControlElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionControlElement();}}

static class IfcInventoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInventory();}}

static class IfcTShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTShapeProfileDef();}}

static class IfcLagTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLagTime();}}

static class IfcMaterialConstituentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialConstituent();}}

static class IfcGridBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGrid();}}

static class IfcTopologyRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTopologyRepresentation();}}

static class IfcCurveStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyle();}}

static class IfcRelFlowControlElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelFlowControlElements();}}

static class IfcStructuralSurfaceMemberVaryingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceMemberVarying();}}

static class IfcLibraryReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLibraryReference();}}

static class IfcTendonAnchorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonAnchorType();}}

static class IfcCableFittingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableFitting();}}

static class IfcRelFillsElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelFillsElement();}}

static class IfcCurtainWallTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurtainWallType();}}

static class IfcCrewResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCrewResource();}}

static class IfcSwitchingDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSwitchingDevice();}}

static class IfcSlabTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlabType();}}

static class IfcRelConnectsStructuralActivityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsStructuralActivity();}}

static class IfcMaterialProfileSetUsageTaperingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialProfileSetUsageTapering();}}

static class IfcRelCoversSpacesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelCoversSpaces();}}

static class IfcSectionReinforcementPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionReinforcementProperties();}}

static class IfcSystemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSystem();}}

static class IfcWindowStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStyle();}}

static class IfcSensorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSensorType();}}

static class IfcMechanicalFastenerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalFastenerType();}}

static class IfcGeographicElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeographicElement();}}

static class IfcStructuralLoadGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadGroup();}}

static class IfcConnectionSurfaceGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionSurfaceGeometry();}}

static class IfcProtectiveDeviceTrippingUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceTrippingUnit();}}

static class IfcMaterialListBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialList();}}

static class IfcRelNestsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelNests();}}

static class IfcTableBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTable();}}

static class IfcRoundedRectangleProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoundedRectangleProfileDef();}}

static class IfcGeometricRepresentationContextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricRepresentationContext();}}

static class IfcRelConnectsPortsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsPorts();}}

static class IfcSurfaceCurveSweptAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceCurveSweptAreaSolid();}}

static class IfcRelAssignsToActorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToActor();}}

static class IfcSIUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSIUnit();}}

static class IfcAudioVisualApplianceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAudioVisualApplianceType();}}

static class IfcRightCircularConeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRightCircularCone();}}

static class IfcFlowInstrumentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowInstrument();}}

static class IfcUnitaryControlElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryControlElementType();}}

static class IfcFlowStorageDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowStorageDevice();}}

static class IfcStructuralSurfaceMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceMember();}}

static class IfcFacetedBrepWithVoidsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFacetedBrepWithVoids();}}

static class IfcTendonTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonType();}}

static class IfcMaterialLayerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayer();}}

static class IfcPcurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPcurve();}}

static class IfcSurfaceFeatureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceFeature();}}

static class IfcEvaporatorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporator();}}

static class IfcConstructionMaterialResourceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionMaterialResourceType();}}

static class IfcMaterialRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialRelationship();}}

static class IfcFlowMeterBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMeter();}}

static class File_DescriptionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new File_Description();}}

static class IfcFlowFittingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowFitting();}}

static class IfcAppliedValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAppliedValue();}}

static class IfcCommunicationsApplianceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCommunicationsApplianceType();}}

static class IfcPipeFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeFittingType();}}

static class IfcEnergyConversionDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnergyConversionDevice();}}

static class IfcLightSourceDirectionalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceDirectional();}}

static class IfcVirtualGridIntersectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVirtualGridIntersection();}}

static class IfcBurnerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBurner();}}

static class IfcActionRequestBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionRequest();}}

static class IfcCableCarrierFittingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierFitting();}}

static class IfcRectangularTrimmedSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangularTrimmedSurface();}}

static class IfcRelAssignsToResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToResource();}}

static class IfcEdgeLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEdgeLoop();}}

static class IfcConnectionPointEccentricityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionPointEccentricity();}}

static class IfcComplexPropertyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcComplexProperty();}}

static class IfcEvaporativeCoolerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporativeCooler();}}

static class IfcStructuralLoadCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadCase();}}

static class IfcSystemFurnitureElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSystemFurnitureElement();}}

static class IfcApplicationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApplication();}}

static class IfcOpenShellBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpenShell();}}

static class IfcTimeSeriesValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesValue();}}

static class IfcReinforcingMeshTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingMeshType();}}

static class IfcInterceptorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInterceptor();}}

static class IfcBlobTextureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBlobTexture();}}

static class IfcTubeBundleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTubeBundle();}}

static class IfcConstructionEquipmentResourceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionEquipmentResourceType();}}

static class IfcCurveStyleFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyleFont();}}

static class IfcPresentationStyleAssignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentationStyleAssignment();}}

static class IfcMappedItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMappedItem();}}

static class IfcConstructionProductResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionProductResource();}}

static class IfcPlanarExtentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlanarExtent();}}

static class IfcLShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLShapeProfileDef();}}

static class IfcDamperTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDamperType();}}

static class IfcTextStyleForDefinedFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleForDefinedFont();}}

static class IfcMaterialLayerSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayerSet();}}

static class IfcCommunicationsApplianceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCommunicationsAppliance();}}

static class IfcResourceTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcResourceTime();}}

static class IfcTaskTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTaskTime();}}

static class IfcImageTextureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcImageTexture();}}

static class IfcSurfaceStyleWithTexturesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleWithTextures();}}

static class IfcVirtualElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVirtualElement();}}

static class IfcActorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActor();}}

static class IfcTankBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTank();}}

static class IfcCircleHollowProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCircleHollowProfileDef();}}

static class IfcRelContainedInSpatialStructureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelContainedInSpatialStructure();}}

static class IfcPermitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermit();}}

static class IfcOrganizationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrganizationRelationship();}}

static class IfcStyledItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStyledItem();}}

static class IfcRelAssignsToProductBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToProduct();}}

static class IfcDiscreteAccessoryTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDiscreteAccessoryType();}}

static class IfcPropertyEnumerationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyEnumeration();}}

static class IfcPumpBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPump();}}

static class IfcConstructionProductResourceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionProductResourceType();}}

static class IfcTaskTimeRecurringBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTaskTimeRecurring();}}

static class IfcFaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFace();}}

static class IfcRelAssignsToGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToGroup();}}

static class IfcProcedureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProcedure();}}

static class IfcSurfaceStyleRenderingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleRendering();}}

static class IfcDoorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoor();}}

static class IfcSpaceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceType();}}

static class IfcStructuralPointActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPointAction();}}

static class IfcFaceBasedSurfaceModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceBasedSurfaceModel();}}

static class IfcRampFlightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampFlight();}}

static class IfcOwnerHistoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOwnerHistory();}}

static class IfcFireSuppressionTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFireSuppressionTerminal();}}

static class File_NameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new File_Name();}}

static class IfcDocumentInformationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentInformationRelationship();}}

static class IfcPileTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPileType();}}

static class IfcShadingDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShadingDevice();}}

static class IfcElectricDistributionBoardTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricDistributionBoardType();}}

static class IfcRelVoidsElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelVoidsElement();}}

static class IfcStructuralCurveMemberVaryingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveMemberVarying();}}

static class IfcQuantityWeightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityWeight();}}

static class IfcElementAssemblyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementAssembly();}}

static class IfcPropertyReferenceValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyReferenceValue();}}

static class IfcFurnitureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurniture();}}

static class IfcLampBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLamp();}}

static class IfcOccupantBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOccupant();}}

static class IfcStructuralLoadConfigurationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadConfiguration();}}

static class IfcRelAssociatesConstraintBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesConstraint();}}

static class IfcFurnishingElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnishingElementType();}}

static class IfcSphereBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSphere();}}

static class IfcBuildingElementProxyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementProxy();}}

static class IfcLibraryInformationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLibraryInformation();}}

static class IfcBoundingBoxBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundingBox();}}

static class IfcVertexLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertexLoop();}}

static class IfcLightSourceGoniometricBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceGoniometric();}}

static class IfcBoxedHalfSpaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoxedHalfSpace();}}

static class IfcRationalBSplineSurfaceWithKnotsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRationalBSplineSurfaceWithKnots();}}

static class IfcEngineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEngine();}}

static class IfcCShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCShapeProfileDef();}}

static class IfcTextureMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureMap();}}

static class IfcCableCarrierSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierSegmentType();}}

static class IfcTaskBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTask();}}

static class IfcPlateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlate();}}

static class IfcSpatialZoneTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpatialZoneType();}}

static class IfcOutletBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOutlet();}}

static class IfcFlowTreatmentDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowTreatmentDevice();}}

static class IfcStairFlightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairFlight();}}

static class IfcCurveBoundedSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveBoundedSurface();}}

static class IfcSlabBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlab();}}

static class IfcDuctFittingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctFitting();}}

static class IfcBSplineCurveWithKnotsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBSplineCurveWithKnots();}}

static class IfcAirTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminal();}}

static class IfcOrientedEdgeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrientedEdge();}}

static class IfcInterceptorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInterceptorType();}}

static class IfcDuctSilencerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSilencerType();}}

static class IfcRelAssociatesClassificationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesClassification();}}

static class IfcCircleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCircle();}}

static class IfcStructuralLoadSingleForceWarpingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleForceWarping();}}

static class IfcArbitraryProfileDefWithVoidsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArbitraryProfileDefWithVoids();}}

static class IfcTextStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyle();}}

static class IfcCurtainWallBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurtainWall();}}

static class IfcArbitraryOpenProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArbitraryOpenProfileDef();}}

static class IfcMaterialProfileWithOffsetsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialProfileWithOffsets();}}

static class IfcActuatorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActuatorType();}}

static class IfcContextDependentUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcContextDependentUnit();}}

static class IfcProcedureTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProcedureType();}}

static class IfcVertexBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertex();}}

static class IfcControllerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcController();}}

static class IfcRelAssignsToGroupByFactorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToGroupByFactor();}}

static class IfcRampBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRamp();}}

static class IfcTankTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTankType();}}

static class IfcCurveBoundedPlaneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveBoundedPlane();}}

static class IfcWorkTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkTime();}}

static class IfcEdgeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEdge();}}

static class IfcAnnotationFillAreaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationFillArea();}}

static class IfcSimplePropertyTemplateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSimplePropertyTemplate();}}

static class IfcStackTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStackTerminal();}}

static class IfcUnitAssignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitAssignment();}}

static class IfcChimneyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChimney();}}

static class IfcVibrationIsolatorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVibrationIsolatorType();}}

static class IfcRelAssignsToProcessBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToProcess();}}

static class IfcCartesianPointList3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianPointList3D();}}

static class IfcRelConnectsElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsElements();}}

static class IfcElectricFlowStorageDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricFlowStorageDevice();}}

static class IfcCartesianPointBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianPoint();}}

static class IfcEllipseProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEllipseProfileDef();}}

static class IfcShellBasedSurfaceModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShellBasedSurfaceModel();}}

static class IfcAirTerminalBoxTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalBoxType();}}

static class IfcExternallyDefinedSurfaceStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedSurfaceStyle();}}

static class IfcPlaneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlane();}}

static class IfcRecurrencePatternBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRecurrencePattern();}}

static class IfcBoundaryFaceConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryFaceCondition();}}

static class IfcStackTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStackTerminalType();}}

static class IfcLocalPlacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLocalPlacement();}}

static class IfcUnitaryEquipmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryEquipmentType();}}

static class IfcDamperBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDamper();}}

static class IfcActuatorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActuator();}}

static class IfcBoundaryNodeConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryNodeCondition();}}

static class IfcCostScheduleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostSchedule();}}

static class IfcRailingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRailing();}}

static class IfcConnectionVolumeGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionVolumeGeometry();}}

static class IfcTaskTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTaskType();}}

static class IfcElectricDistributionBoardBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricDistributionBoard();}}

static class IfcLightSourceAmbientBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceAmbient();}}

static class IfcElectricMotorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricMotorType();}}

static class IfcTextLiteralBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextLiteral();}}

static class File_SchemaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new File_Schema();}}

static class IfcElementQuantityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementQuantity();}}

static class IfcRegularTimeSeriesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRegularTimeSeries();}}

static class IfcFootingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFootingType();}}

static class IfcPipeSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeSegment();}}

static class IfcTendonBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendon();}}

static class IfcWallTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallType();}}

static class IfcPersonBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPerson();}}

static class IfcWorkPlanBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkPlan();}}

static class IfcFastenerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFastenerType();}}

static class IfcTelecomAddressBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTelecomAddress();}}

static class IfcPropertyTableValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyTableValue();}}

static class IfcIrregularTimeSeriesValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIrregularTimeSeriesValue();}}

static class IfcDocumentInformationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentInformation();}}

static class IfcReinforcementBarPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcementBarProperties();}}

static class IfcIndexedTriangleTextureMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIndexedTriangleTextureMap();}}

static class IfcSweptDiskSolidPolygonalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSweptDiskSolidPolygonal();}}

static class IfcMedicalDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMedicalDeviceType();}}

static class IfcArbitraryClosedProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArbitraryClosedProfileDef();}}

static class IfcClassificationReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassificationReference();}}

static class IfcMotorConnectionTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMotorConnectionType();}}

static class IfcTimePeriodBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimePeriod();}}

static class IfcWindowBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindow();}}

static class IfcBoundaryEdgeConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryEdgeCondition();}}

static class IfcRelServicesBuildingsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelServicesBuildings();}}

static class IfcCableSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableSegmentType();}}

static class IfcComplexPropertyTemplateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcComplexPropertyTemplate();}}

static class IfcElectricApplianceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricAppliance();}}

static class IfcMaterialConstituentSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialConstituentSet();}}

static class IfcReinforcementDefinitionPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcementDefinitionProperties();}}

static class IfcElectricTimeControlBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricTimeControl();}}

static class IfcRelCoversBldgElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelCoversBldgElements();}}

static class IfcColourRgbListBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColourRgbList();}}

static class IfcStructuralSurfaceReactionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceReaction();}}

static class IfcPresentationLayerAssignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentationLayerAssignment();}}

static class IfcStructuralCurveMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveMember();}}

static class IfcRectangularPyramidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangularPyramid();}}

static class IfcShapeRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShapeRepresentation();}}

static class IfcEdgeCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEdgeCurve();}}

static class IfcConnectionCurveGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionCurveGeometry();}}

static class IfcProtectiveDeviceTrippingUnitTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceTrippingUnitType();}}

static class IfcPerformanceHistoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPerformanceHistory();}}

static class IfcRelDefinesByTemplateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDefinesByTemplate();}}

static class IfcMaterialDefinitionRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialDefinitionRepresentation();}}

static class IfcStructuralLoadSingleForceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleForce();}}

static class IfcCableFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableFittingType();}}

static class IfcCooledBeamTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCooledBeamType();}}

static class IfcTypeProductBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTypeProduct();}}

static class IfcLightFixtureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightFixture();}}

static class IfcRailingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRailingType();}}

static class IfcGeometricSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricSet();}}

static class IfcResourceApprovalRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcResourceApprovalRelationship();}}

static class IfcDoorLiningPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorLiningProperties();}}

static class IfcVoidingFeatureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVoidingFeature();}}

static class IfcProjectLibraryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectLibrary();}}

static class IfcCenterLineProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCenterLineProfileDef();}}

static class IfcDraughtingPreDefinedCurveFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingPreDefinedCurveFont();}}

static class IfcHeatExchangerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatExchanger();}}

static class IfcFailureConnectionConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFailureConnectionCondition();}}

static class IfcColumnBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumn();}}

static class IfcPointOnSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPointOnSurface();}}

static class IfcStructuralPointReactionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPointReaction();}}

static class IfcStructuralSurfaceConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceConnection();}}

static class IfcSensorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSensor();}}

static class IfcSpaceHeaterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceHeaterType();}}

static class IfcStyledRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStyledRepresentation();}}

static class IfcElectricApplianceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricApplianceType();}}

static class IfcPolylineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPolyline();}}

static class IfcProxyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProxy();}}

static class IfcRationalBSplineCurveWithKnotsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRationalBSplineCurveWithKnots();}}

static class IfcElectricFlowStorageDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricFlowStorageDeviceType();}}

static class IfcStructuralLoadSingleDisplacementDistortionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleDisplacementDistortion();}}

static class IfcUnitaryEquipmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryEquipment();}}

static class IfcFaceBoundBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceBound();}}

static class IfcBuildingElementPartTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementPartType();}}

static class IfcAnnotationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotation();}}

static class IfcSystemFurnitureElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSystemFurnitureElementType();}}

static class IfcTrapeziumProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTrapeziumProfileDef();}}

static class IfcFillAreaStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyle();}}

static class IfcConnectionPointGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionPointGeometry();}}

static class IfcHumidifierTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHumidifierType();}}

static class IfcChillerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChiller();}}

static class IfcDiscreteAccessoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDiscreteAccessory();}}

static class IfcWindowLiningPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowLiningProperties();}}

static class IfcBuildingElementProxyTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementProxyType();}}

static class IfcLaborResourceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLaborResourceType();}}

static class IfcAirTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalType();}}

static class IfcBSplineSurfaceWithKnotsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBSplineSurfaceWithKnots();}}

static class IfcLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLoop();}}

static class IfcPumpTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPumpType();}}

static class IfcFurnitureTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnitureType();}}

static class IfcPlanarBoxBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlanarBox();}}

static class IfcObjectiveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcObjective();}}

static class IfcRevolvedAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRevolvedAreaSolid();}}

static class IfcRelProjectsElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelProjectsElement();}}

static class IfcWallBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWall();}}

static class IfcChimneyTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChimneyType();}}

static class IfcCompressorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompressorType();}}

static class IfcSweptDiskSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSweptDiskSolid();}}

static class IfcBeamStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeamStandardCase();}}

static class IfcElectricMotorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricMotor();}}

static class IfcResourceConstraintRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcResourceConstraintRelationship();}}

static class IfcTransportElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransportElement();}}

static class IfcMaterialLayerWithOffsetsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayerWithOffsets();}}

static class IfcBuildingElementPartBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementPart();}}

static class IfcAxis2Placement3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAxis2Placement3D();}}

static class IfcIndexedColourMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIndexedColourMap();}}

static class IfcClassificationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassification();}}

static class IfcFlowMovingDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMovingDevice();}}

static class IfcTextureVertexListBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureVertexList();}}

static class IfcMetricBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMetric();}}

static class IfcLightFixtureTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightFixtureType();}}

static class IfcUnitaryControlElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryControlElement();}}

static class IfcCableCarrierFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierFittingType();}}

static class IfcStructuralLinearActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLinearAction();}}

static class IfcGridPlacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGridPlacement();}}

static class IfcDoorPanelPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorPanelProperties();}}

static class IfcFlowInstrumentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowInstrumentType();}}

static class IfcDistributionChamberElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionChamberElement();}}

static class IfcDistributionPortBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionPort();}}

static class IfcCoolingTowerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoolingTower();}}

static class IfcCartesianTransformationOperator3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator3D();}}

static class IfcFastenerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFastener();}}

static class IfcStructuralAnalysisModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralAnalysisModel();}}

static class IfcWallElementedCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallElementedCase();}}

static class IfcGeographicElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeographicElementType();}}

static class IfcStructuralCurveReactionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveReaction();}}

static class IfcClosedShellBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClosedShell();}}

static class IfcAxis2Placement2DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAxis2Placement2D();}}

static class IfcFlowMeterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMeterType();}}

static class IfcWorkScheduleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkSchedule();}}

static class IfcCoolingTowerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoolingTowerType();}}

static class IfcOutletTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOutletType();}}

static class IfcRelConnectsWithRealizingElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsWithRealizingElements();}}

static class IfcFixedReferenceSweptAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFixedReferenceSweptAreaSolid();}}

static class IfcSpatialZoneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpatialZone();}}

static class IfcDistributionFlowElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionFlowElement();}}

static class IfcCompositeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeProfileDef();}}

static class IfcPropertyBoundedValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyBoundedValue();}}

static class IfcAsymmetricIShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAsymmetricIShapeProfileDef();}}

static class IfcTransformerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransformer();}}

static class IfcQuantityLengthBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityLength();}}

static class IfcSlippageConnectionConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlippageConnectionCondition();}}

static class IfcZShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcZShapeProfileDef();}}

static class IfcCoilTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoilType();}}

static class IfcPropertySingleValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySingleValue();}}

static class IfcBlockBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBlock();}}

static class IfcCartesianTransformationOperator2DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator2D();}}

static class IfcPhysicalComplexQuantityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPhysicalComplexQuantity();}}

static class INTEGERBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new INTEGER();}}

static class DOUBLEBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new DOUBLE();}}

static class BOOLEANBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new BOOLEAN();}}

static class BINARYBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new BINARY();}}

static class REALBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new REAL();}}

static class STRINGBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new STRING();}}

static class LOGICALBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new LOGICAL();}}

}

