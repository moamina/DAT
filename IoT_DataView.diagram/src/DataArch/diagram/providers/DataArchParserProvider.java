/*
 * 
 */
package DataArch.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataArchParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser dataNodeNodeName_5060Parser;

	/**
	* @generated
	*/
	private IParser getDataNodeNodeName_5060Parser() {
		if (dataNodeNodeName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { DataArch.DataArchPackage.eINSTANCE.getDataNode_NodeName() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			dataNodeNodeName_5060Parser = parser;
		}
		return dataNodeNodeName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser audioName_5001Parser;

	/**
	* @generated
	*/
	private IParser getAudioName_5001Parser() {
		if (audioName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			audioName_5001Parser = parser;
		}
		return audioName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser videoName_5002Parser;

	/**
	* @generated
	*/
	private IParser getVideoName_5002Parser() {
		if (videoName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			videoName_5002Parser = parser;
		}
		return videoName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser imageName_5003Parser;

	/**
	* @generated
	*/
	private IParser getImageName_5003Parser() {
		if (imageName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			imageName_5003Parser = parser;
		}
		return imageName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser logsName_5004Parser;

	/**
	* @generated
	*/
	private IParser getLogsName_5004Parser() {
		if (logsName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			logsName_5004Parser = parser;
		}
		return logsName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser wordFileName_5005Parser;

	/**
	* @generated
	*/
	private IParser getWordFileName_5005Parser() {
		if (wordFileName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			wordFileName_5005Parser = parser;
		}
		return wordFileName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser pDFFileName_5006Parser;

	/**
	* @generated
	*/
	private IParser getPDFFileName_5006Parser() {
		if (pDFFileName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			pDFFileName_5006Parser = parser;
		}
		return pDFFileName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser textFileName_5007Parser;

	/**
	* @generated
	*/
	private IParser getTextFileName_5007Parser() {
		if (textFileName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			textFileName_5007Parser = parser;
		}
		return textFileName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser relationalDBName_5008Parser;

	/**
	* @generated
	*/
	private IParser getRelationalDBName_5008Parser() {
		if (relationalDBName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			relationalDBName_5008Parser = parser;
		}
		return relationalDBName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser xMLName_5009Parser;

	/**
	* @generated
	*/
	private IParser getXMLName_5009Parser() {
		if (xMLName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			xMLName_5009Parser = parser;
		}
		return xMLName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser jSONName_5010Parser;

	/**
	* @generated
	*/
	private IParser getJSONName_5010Parser() {
		if (jSONName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			jSONName_5010Parser = parser;
		}
		return jSONName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser cSVName_5011Parser;

	/**
	* @generated
	*/
	private IParser getCSVName_5011Parser() {
		if (cSVName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			cSVName_5011Parser = parser;
		}
		return cSVName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser excelName_5012Parser;

	/**
	* @generated
	*/
	private IParser getExcelName_5012Parser() {
		if (excelName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			excelName_5012Parser = parser;
		}
		return excelName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser hTMLName_5013Parser;

	/**
	* @generated
	*/
	private IParser getHTMLName_5013Parser() {
		if (hTMLName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			hTMLName_5013Parser = parser;
		}
		return hTMLName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser rDFName_5014Parser;

	/**
	* @generated
	*/
	private IParser getRDFName_5014Parser() {
		if (rDFName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			rDFName_5014Parser = parser;
		}
		return rDFName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser eDIName_5015Parser;

	/**
	* @generated
	*/
	private IParser getEDIName_5015Parser() {
		if (eDIName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			eDIName_5015Parser = parser;
		}
		return eDIName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser sMSName_5016Parser;

	/**
	* @generated
	*/
	private IParser getSMSName_5016Parser() {
		if (sMSName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			sMSName_5016Parser = parser;
		}
		return sMSName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser emailName_5017Parser;

	/**
	* @generated
	*/
	private IParser getEmailName_5017Parser() {
		if (emailName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			emailName_5017Parser = parser;
		}
		return emailName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser gPSDataName_5018Parser;

	/**
	* @generated
	*/
	private IParser getGPSDataName_5018Parser() {
		if (gPSDataName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			gPSDataName_5018Parser = parser;
		}
		return gPSDataName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser sensorDataName_5019Parser;

	/**
	* @generated
	*/
	private IParser getSensorDataName_5019Parser() {
		if (sensorDataName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			sensorDataName_5019Parser = parser;
		}
		return sensorDataName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser documentOrientedName_5020Parser;

	/**
	* @generated
	*/
	private IParser getDocumentOrientedName_5020Parser() {
		if (documentOrientedName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			documentOrientedName_5020Parser = parser;
		}
		return documentOrientedName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser columnOrientedName_5021Parser;

	/**
	* @generated
	*/
	private IParser getColumnOrientedName_5021Parser() {
		if (columnOrientedName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			columnOrientedName_5021Parser = parser;
		}
		return columnOrientedName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser graphsDatabaseName_5022Parser;

	/**
	* @generated
	*/
	private IParser getGraphsDatabaseName_5022Parser() {
		if (graphsDatabaseName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			graphsDatabaseName_5022Parser = parser;
		}
		return graphsDatabaseName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser keyValueName_5023Parser;

	/**
	* @generated
	*/
	private IParser getKeyValueName_5023Parser() {
		if (keyValueName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			keyValueName_5023Parser = parser;
		}
		return keyValueName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser cloudName_5061Parser;

	/**
	* @generated
	*/
	private IParser getCloudName_5061Parser() {
		if (cloudName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			cloudName_5061Parser = parser;
		}
		return cloudName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser on_PremiseName_5062Parser;

	/**
	* @generated
	*/
	private IParser getOn_PremiseName_5062Parser() {
		if (on_PremiseName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			on_PremiseName_5062Parser = parser;
		}
		return on_PremiseName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser file_SystemName_5024Parser;

	/**
	* @generated
	*/
	private IParser getFile_SystemName_5024Parser() {
		if (file_SystemName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			file_SystemName_5024Parser = parser;
		}
		return file_SystemName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser relationalName_5025Parser;

	/**
	* @generated
	*/
	private IParser getRelationalName_5025Parser() {
		if (relationalName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			relationalName_5025Parser = parser;
		}
		return relationalName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser multidimensionalName_5026Parser;

	/**
	* @generated
	*/
	private IParser getMultidimensionalName_5026Parser() {
		if (multidimensionalName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			multidimensionalName_5026Parser = parser;
		}
		return multidimensionalName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser realTimeName_5027Parser;

	/**
	* @generated
	*/
	private IParser getRealTimeName_5027Parser() {
		if (realTimeName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			realTimeName_5027Parser = parser;
		}
		return realTimeName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser batchName_5028Parser;

	/**
	* @generated
	*/
	private IParser getBatchName_5028Parser() {
		if (batchName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			batchName_5028Parser = parser;
		}
		return batchName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser filterName_5029Parser;

	/**
	* @generated
	*/
	private IParser getFilterName_5029Parser() {
		if (filterName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			filterName_5029Parser = parser;
		}
		return filterName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser describeName_5030Parser;

	/**
	* @generated
	*/
	private IParser getDescribeName_5030Parser() {
		if (describeName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			describeName_5030Parser = parser;
		}
		return describeName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser diagnoseName_5031Parser;

	/**
	* @generated
	*/
	private IParser getDiagnoseName_5031Parser() {
		if (diagnoseName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			diagnoseName_5031Parser = parser;
		}
		return diagnoseName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser predictName_5032Parser;

	/**
	* @generated
	*/
	private IParser getPredictName_5032Parser() {
		if (predictName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			predictName_5032Parser = parser;
		}
		return predictName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser prescriptName_5033Parser;

	/**
	* @generated
	*/
	private IParser getPrescriptName_5033Parser() {
		if (prescriptName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			prescriptName_5033Parser = parser;
		}
		return prescriptName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizeName_5034Parser;

	/**
	* @generated
	*/
	private IParser getVisualizeName_5034Parser() {
		if (visualizeName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			visualizeName_5034Parser = parser;
		}
		return visualizeName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser query_ReportName_5035Parser;

	/**
	* @generated
	*/
	private IParser getQuery_ReportName_5035Parser() {
		if (query_ReportName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			query_ReportName_5035Parser = parser;
		}
		return query_ReportName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser aPIName_5036Parser;

	/**
	* @generated
	*/
	private IParser getAPIName_5036Parser() {
		if (aPIName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			aPIName_5036Parser = parser;
		}
		return aPIName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser tranfromName_5037Parser;

	/**
	* @generated
	*/
	private IParser getTranfromName_5037Parser() {
		if (tranfromName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			tranfromName_5037Parser = parser;
		}
		return tranfromName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser compressName_5038Parser;

	/**
	* @generated
	*/
	private IParser getCompressName_5038Parser() {
		if (compressName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			compressName_5038Parser = parser;
		}
		return compressName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser integrateName_5039Parser;

	/**
	* @generated
	*/
	private IParser getIntegrateName_5039Parser() {
		if (integrateName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			integrateName_5039Parser = parser;
		}
		return integrateName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser identifyName_5040Parser;

	/**
	* @generated
	*/
	private IParser getIdentifyName_5040Parser() {
		if (identifyName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			identifyName_5040Parser = parser;
		}
		return identifyName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser validateName_5041Parser;

	/**
	* @generated
	*/
	private IParser getValidateName_5041Parser() {
		if (validateName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			validateName_5041Parser = parser;
		}
		return validateName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser classifyName_5042Parser;

	/**
	* @generated
	*/
	private IParser getClassifyName_5042Parser() {
		if (classifyName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			classifyName_5042Parser = parser;
		}
		return classifyName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser sortName_5043Parser;

	/**
	* @generated
	*/
	private IParser getSortName_5043Parser() {
		if (sortName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			sortName_5043Parser = parser;
		}
		return sortName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser mergeName_5044Parser;

	/**
	* @generated
	*/
	private IParser getMergeName_5044Parser() {
		if (mergeName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			mergeName_5044Parser = parser;
		}
		return mergeName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregateName_5045Parser;

	/**
	* @generated
	*/
	private IParser getAggregateName_5045Parser() {
		if (aggregateName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			aggregateName_5045Parser = parser;
		}
		return aggregateName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningName_5046Parser;

	/**
	* @generated
	*/
	private IParser getCleaningName_5046Parser() {
		if (cleaningName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			cleaningName_5046Parser = parser;
		}
		return cleaningName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser reduceNoiseName_5047Parser;

	/**
	* @generated
	*/
	private IParser getReduceNoiseName_5047Parser() {
		if (reduceNoiseName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			reduceNoiseName_5047Parser = parser;
		}
		return reduceNoiseName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser math_OperationName_5048Parser;

	/**
	* @generated
	*/
	private IParser getMath_OperationName_5048Parser() {
		if (math_OperationName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			math_OperationName_5048Parser = parser;
		}
		return math_OperationName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser retrieveName_5049Parser;

	/**
	* @generated
	*/
	private IParser getRetrieveName_5049Parser() {
		if (retrieveName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			retrieveName_5049Parser = parser;
		}
		return retrieveName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser saveName_5050Parser;

	/**
	* @generated
	*/
	private IParser getSaveName_5050Parser() {
		if (saveName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			saveName_5050Parser = parser;
		}
		return saveName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser archiveName_5051Parser;

	/**
	* @generated
	*/
	private IParser getArchiveName_5051Parser() {
		if (archiveName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			archiveName_5051Parser = parser;
		}
		return archiveName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser governName_5052Parser;

	/**
	* @generated
	*/
	private IParser getGovernName_5052Parser() {
		if (governName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			governName_5052Parser = parser;
		}
		return governName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser receiveDataName_5053Parser;

	/**
	* @generated
	*/
	private IParser getReceiveDataName_5053Parser() {
		if (receiveDataName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			receiveDataName_5053Parser = parser;
		}
		return receiveDataName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser sendDataName_5054Parser;

	/**
	* @generated
	*/
	private IParser getSendDataName_5054Parser() {
		if (sendDataName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			sendDataName_5054Parser = parser;
		}
		return sendDataName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser generateName_5055Parser;

	/**
	* @generated
	*/
	private IParser getGenerateName_5055Parser() {
		if (generateName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			generateName_5055Parser = parser;
		}
		return generateName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser ingestName_5063Parser;

	/**
	* @generated
	*/
	private IParser getIngestName_5063Parser() {
		if (ingestName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			ingestName_5063Parser = parser;
		}
		return ingestName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser analyzeName_5056Parser;

	/**
	* @generated
	*/
	private IParser getAnalyzeName_5056Parser() {
		if (analyzeName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			analyzeName_5056Parser = parser;
		}
		return analyzeName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser processName_5057Parser;

	/**
	* @generated
	*/
	private IParser getProcessName_5057Parser() {
		if (processName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DataArch.DataArchPackage.eINSTANCE.getBehaviouralElement_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			processName_5057Parser = parser;
		}
		return processName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser inMessagePortName_5058Parser;

	/**
	* @generated
	*/
	private IParser getInMessagePortName_5058Parser() {
		if (inMessagePortName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { DataArch.DataArchPackage.eINSTANCE.getMessagePort_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			inMessagePortName_5058Parser = parser;
		}
		return inMessagePortName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser outMessagePortName_5059Parser;

	/**
	* @generated
	*/
	private IParser getOutMessagePortName_5059Parser() {
		if (outMessagePortName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { DataArch.DataArchPackage.eINSTANCE.getMessagePort_Name() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			outMessagePortName_5059Parser = parser;
		}
		return outMessagePortName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser connectionText_6001Parser;

	/**
	* @generated
	*/
	private IParser getConnectionText_6001Parser() {
		if (connectionText_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { DataArch.DataArchPackage.eINSTANCE.getConnection_Text() };
			DataArch.diagram.parsers.MessageFormatParser parser = new DataArch.diagram.parsers.MessageFormatParser(
					features);
			connectionText_6001Parser = parser;
		}
		return connectionText_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DataArch.diagram.edit.parts.DataNodeNodeNameEditPart.VISUAL_ID:
			return getDataNodeNodeName_5060Parser();
		case DataArch.diagram.edit.parts.AudioNameEditPart.VISUAL_ID:
			return getAudioName_5001Parser();
		case DataArch.diagram.edit.parts.VideoNameEditPart.VISUAL_ID:
			return getVideoName_5002Parser();
		case DataArch.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
			return getImageName_5003Parser();
		case DataArch.diagram.edit.parts.LogsNameEditPart.VISUAL_ID:
			return getLogsName_5004Parser();
		case DataArch.diagram.edit.parts.WordFileNameEditPart.VISUAL_ID:
			return getWordFileName_5005Parser();
		case DataArch.diagram.edit.parts.PDFFileNameEditPart.VISUAL_ID:
			return getPDFFileName_5006Parser();
		case DataArch.diagram.edit.parts.TextFileNameEditPart.VISUAL_ID:
			return getTextFileName_5007Parser();
		case DataArch.diagram.edit.parts.RelationalDBNameEditPart.VISUAL_ID:
			return getRelationalDBName_5008Parser();
		case DataArch.diagram.edit.parts.XMLNameEditPart.VISUAL_ID:
			return getXMLName_5009Parser();
		case DataArch.diagram.edit.parts.JSONNameEditPart.VISUAL_ID:
			return getJSONName_5010Parser();
		case DataArch.diagram.edit.parts.CSVNameEditPart.VISUAL_ID:
			return getCSVName_5011Parser();
		case DataArch.diagram.edit.parts.ExcelNameEditPart.VISUAL_ID:
			return getExcelName_5012Parser();
		case DataArch.diagram.edit.parts.HTMLNameEditPart.VISUAL_ID:
			return getHTMLName_5013Parser();
		case DataArch.diagram.edit.parts.RDFNameEditPart.VISUAL_ID:
			return getRDFName_5014Parser();
		case DataArch.diagram.edit.parts.EDINameEditPart.VISUAL_ID:
			return getEDIName_5015Parser();
		case DataArch.diagram.edit.parts.SMSNameEditPart.VISUAL_ID:
			return getSMSName_5016Parser();
		case DataArch.diagram.edit.parts.EmailNameEditPart.VISUAL_ID:
			return getEmailName_5017Parser();
		case DataArch.diagram.edit.parts.GPSDataNameEditPart.VISUAL_ID:
			return getGPSDataName_5018Parser();
		case DataArch.diagram.edit.parts.SensorDataNameEditPart.VISUAL_ID:
			return getSensorDataName_5019Parser();
		case DataArch.diagram.edit.parts.DocumentOrientedNameEditPart.VISUAL_ID:
			return getDocumentOrientedName_5020Parser();
		case DataArch.diagram.edit.parts.ColumnOrientedNameEditPart.VISUAL_ID:
			return getColumnOrientedName_5021Parser();
		case DataArch.diagram.edit.parts.GraphsDatabaseNameEditPart.VISUAL_ID:
			return getGraphsDatabaseName_5022Parser();
		case DataArch.diagram.edit.parts.KeyValueNameEditPart.VISUAL_ID:
			return getKeyValueName_5023Parser();
		case DataArch.diagram.edit.parts.CloudNameEditPart.VISUAL_ID:
			return getCloudName_5061Parser();
		case DataArch.diagram.edit.parts.On_PremiseNameEditPart.VISUAL_ID:
			return getOn_PremiseName_5062Parser();
		case DataArch.diagram.edit.parts.File_SystemNameEditPart.VISUAL_ID:
			return getFile_SystemName_5024Parser();
		case DataArch.diagram.edit.parts.RelationalNameEditPart.VISUAL_ID:
			return getRelationalName_5025Parser();
		case DataArch.diagram.edit.parts.MultidimensionalNameEditPart.VISUAL_ID:
			return getMultidimensionalName_5026Parser();
		case DataArch.diagram.edit.parts.RealTimeNameEditPart.VISUAL_ID:
			return getRealTimeName_5027Parser();
		case DataArch.diagram.edit.parts.BatchNameEditPart.VISUAL_ID:
			return getBatchName_5028Parser();
		case DataArch.diagram.edit.parts.FilterNameEditPart.VISUAL_ID:
			return getFilterName_5029Parser();
		case DataArch.diagram.edit.parts.DescribeNameEditPart.VISUAL_ID:
			return getDescribeName_5030Parser();
		case DataArch.diagram.edit.parts.DiagnoseNameEditPart.VISUAL_ID:
			return getDiagnoseName_5031Parser();
		case DataArch.diagram.edit.parts.PredictNameEditPart.VISUAL_ID:
			return getPredictName_5032Parser();
		case DataArch.diagram.edit.parts.PrescriptNameEditPart.VISUAL_ID:
			return getPrescriptName_5033Parser();
		case DataArch.diagram.edit.parts.VisualizeNameEditPart.VISUAL_ID:
			return getVisualizeName_5034Parser();
		case DataArch.diagram.edit.parts.Query_ReportNameEditPart.VISUAL_ID:
			return getQuery_ReportName_5035Parser();
		case DataArch.diagram.edit.parts.APINameEditPart.VISUAL_ID:
			return getAPIName_5036Parser();
		case DataArch.diagram.edit.parts.TranfromNameEditPart.VISUAL_ID:
			return getTranfromName_5037Parser();
		case DataArch.diagram.edit.parts.CompressNameEditPart.VISUAL_ID:
			return getCompressName_5038Parser();
		case DataArch.diagram.edit.parts.IntegrateNameEditPart.VISUAL_ID:
			return getIntegrateName_5039Parser();
		case DataArch.diagram.edit.parts.IdentifyNameEditPart.VISUAL_ID:
			return getIdentifyName_5040Parser();
		case DataArch.diagram.edit.parts.ValidateNameEditPart.VISUAL_ID:
			return getValidateName_5041Parser();
		case DataArch.diagram.edit.parts.ClassifyNameEditPart.VISUAL_ID:
			return getClassifyName_5042Parser();
		case DataArch.diagram.edit.parts.SortNameEditPart.VISUAL_ID:
			return getSortName_5043Parser();
		case DataArch.diagram.edit.parts.MergeNameEditPart.VISUAL_ID:
			return getMergeName_5044Parser();
		case DataArch.diagram.edit.parts.AggregateNameEditPart.VISUAL_ID:
			return getAggregateName_5045Parser();
		case DataArch.diagram.edit.parts.CleaningNameEditPart.VISUAL_ID:
			return getCleaningName_5046Parser();
		case DataArch.diagram.edit.parts.ReduceNoiseNameEditPart.VISUAL_ID:
			return getReduceNoiseName_5047Parser();
		case DataArch.diagram.edit.parts.Math_OperationNameEditPart.VISUAL_ID:
			return getMath_OperationName_5048Parser();
		case DataArch.diagram.edit.parts.RetrieveNameEditPart.VISUAL_ID:
			return getRetrieveName_5049Parser();
		case DataArch.diagram.edit.parts.SaveNameEditPart.VISUAL_ID:
			return getSaveName_5050Parser();
		case DataArch.diagram.edit.parts.ArchiveNameEditPart.VISUAL_ID:
			return getArchiveName_5051Parser();
		case DataArch.diagram.edit.parts.GovernNameEditPart.VISUAL_ID:
			return getGovernName_5052Parser();
		case DataArch.diagram.edit.parts.ReceiveDataNameEditPart.VISUAL_ID:
			return getReceiveDataName_5053Parser();
		case DataArch.diagram.edit.parts.SendDataNameEditPart.VISUAL_ID:
			return getSendDataName_5054Parser();
		case DataArch.diagram.edit.parts.GenerateNameEditPart.VISUAL_ID:
			return getGenerateName_5055Parser();
		case DataArch.diagram.edit.parts.IngestNameEditPart.VISUAL_ID:
			return getIngestName_5063Parser();
		case DataArch.diagram.edit.parts.AnalyzeNameEditPart.VISUAL_ID:
			return getAnalyzeName_5056Parser();
		case DataArch.diagram.edit.parts.ProcessNameEditPart.VISUAL_ID:
			return getProcessName_5057Parser();
		case DataArch.diagram.edit.parts.InMessagePortNameEditPart.VISUAL_ID:
			return getInMessagePortName_5058Parser();
		case DataArch.diagram.edit.parts.OutMessagePortNameEditPart.VISUAL_ID:
			return getOutMessagePortName_5059Parser();
		case DataArch.diagram.edit.parts.ConnectionTextEditPart.VISUAL_ID:
			return getConnectionText_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DataArch.diagram.part.DataArchVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DataArch.diagram.providers.DataArchElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
