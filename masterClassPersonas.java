import com.ibm.dtfj.javacore.parser.j9.section.platform.PlatformSectionParser;
import com.rational.test.ft.ObjectNotFoundException;

import okhttp3.internal.platform.Platform;
import resources.masterClassPersonasHelper;

public class masterClassPersonas extends masterClassPersonasHelper {

	public void cpRecall(String cpcalled, Object args[]) throws ObjectNotFoundException {
		try {
			callScript(cpcalled, args);
			System.out.print(cpcalled + " " + (String) args[0] + " Success \n");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.print(cpcalled + " " + (String) args[0] + " Failed \n");
		}
	}


	public void testMain(Object[] args){ 

		   cpRecall("Platforms.Personas.Desafio_Automatización_QA_Harry_Rodriguéz",new String[]{"CP001"});
		   //cpRecall("Platforms.Personas.ID_CYF_PJ_HU28_HU29_HU26_001",new String[]{"CP001"});
			/*cpRecall("Platforms.Personas.ID_CD_EPF_HU141A_001",new String[]{"CP_032"});
			cpRecall("Platforms.Personas.ID_CD_EPF_HU141A_001",new String[]{"CP_033"});
			cpRecall("Platforms.Personas.ID_CD_EPF_HU141A_012",new String[]{"CP_043"});
	   		cpRecall("Platforms.Personas.ID_EPF_1_108_0002",new String[]{"CP_002"});
	   		cpRecall("Platforms.Personas.ID_EPF_1_110A_0054",new String[]{"CP_054"});
	   		cpRecall("Platforms.Personas.ID_EPF_1_110A_0056",new String[]{"CP_056"});
	   		cpRecall("Platforms.Personas.ID_EPF_1_111_0121",new String[]{"CP_121"});
			cpRecall("Platforms.Personas.ID_EPF_1_111_0122",new String[]{"CP_122"});
			cpRecall("Platforms.Personas.ID_EPF_1_108_0047",new String[]{"CP_047"});
			cpRecall("Platforms.Personas.ID_EPF_1_108_0047",new String[]{"CP_048"});
			cpRecall("Platforms.Personas.ID_EPF_1_153_0036",new String[]{"CP_036"});
			cpRecall("Platforms.Personas.ID_EPF_1_153_0037",new String[]{"CP_037"});*/
			
  
 }}


   
   





		