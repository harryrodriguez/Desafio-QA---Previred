package Platforms.Personas;
import resources.Platforms.Personas.Desafio_Automatización_QA_Harry_RodriguézHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

import Framework.DatapoolParser;
import Framework.RationalTestScriptWebSelenium;
import Locators.Locator_Harry_Rodriguez;
import Locators.LocatorsPersonas;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.select;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
import com.ibm.xtq.bcel.generic.Select;

public class Desafio_Automatización_QA_Harry_Rodriguéz extends Desafio_Automatización_QA_Harry_RodriguézHelper
{

	public void testMain(Object[] args) 
	{
		String cpID = (String) args[0];

		DatapoolParser pool = new DatapoolParser("C:\\Workspaces\\RFT\\DataPool.xlsx");
		pool.filter("CP", cpID, true);
		RationalTestScriptWebSelenium selenium = new RationalTestScriptWebSelenium(cpID, pool.getValue("BROWSER"));
		try{
																								
			//Login 
			selenium.startTest("Desafio_QA");
			//selenium.loginPersona(pool);
			//selenium.LoginEmpresa(pool);			
			sleep(2);
			//WebDriver driver = selenium.getDriver();
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.LOGO_PAGINA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.LOGO_PAGINA);
	        sleep(5);

			String Objeto1="ipod classic";
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BUSCADOR);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BUSCADOR,Objeto1);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_BUSCAR);
	        sleep(20);
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.IPODCLASSIC_ADD, 20);
			
			boolean ipod = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.IPODCLASSIC_ADD, 10);
			
			if(ipod){
				selenium.manualCheck("Producto_iPod_Classic", true);
				selenium.takeScreenshotRQM("iPod_Classic_OK");
			}else{
				selenium.manualCheck("iPod_Classic_No_encontrado", false);
			}		
			selenium.endCaseOk();
			
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.IPODCLASSIC_ADD);
	        sleep(10);     
	        
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.LOGO_PAGINA);
			
			String Objeto2="imac";
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BUSCADOR);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BUSCADOR,Objeto2);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_BUSCAR);
	        sleep(10);
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.IMAC_ADD, 20);
			
			boolean iMac = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.IMAC_ADD, 10);
			
			if(iMac){
				selenium.manualCheck("Producto_iMac", true);
				selenium.takeScreenshotRQM("iPod_iMac_OK");
			}else{
				selenium.manualCheck("iMac_No_encontrado", false);
			}		
			selenium.endCaseOk();

			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.IMAC_ADD);
	        sleep(10);     
	        
	       String Objeto3="Apple Cinema 30";
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BUSCADOR);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BUSCADOR,Objeto3);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_BUSCAR);
	        sleep(10);
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CINEMA_ADD, 20);
			
			boolean Cinema = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CINEMA_ADD, 10);
			
			if(Cinema){
				selenium.manualCheck("Producto_Apple_Cinema", true);
				selenium.takeScreenshotRQM("Apple_Cinema_OK");
			}else{
				selenium.manualCheck("Apple_Cinema_encontrado", false);
			}		
			selenium.endCaseOk();

			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CINEMA_ADD);
	        sleep(10);
	        
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECK_RADIO, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECK_RADIO);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECKBOX_3, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECKBOX_3);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECKBOX_4, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECKBOX_4);
			
			String TEXTO ="Test_1";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TEXTO, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TEXTO);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TEXTO,TEXTO);

			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.SELECT_DESPLEGABLE, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.SELECT_DESPLEGABLE);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.YELLOW);		
			
			String TEXTAREA ="Data de prueba";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TEXTAREA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TEXTAREA);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TEXTAREA,TEXTAREA);
		
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.ARCHIVO, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.ARCHIVO);
			File file = new File("C:\\Users\\EHRB5871.ITAUCHILE\\Downloads\\MicrosoftTeams-image (14).png");
			String path = file.getAbsolutePath();
            selenium.findElement(By.xpath("ARCHIVO")).sendKeys(path);
			
			String FECHA ="2022-01-26";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.FECHA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.FECHA);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.FECHA,FECHA);

			String TIEMPO ="17:25";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TIEMPO, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TIEMPO);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.TIEMPO,TIEMPO);

			String FECHARELOJ ="2021-12-24 23:55";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.FECHAYRELOJ, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.FECHAYRELOJ);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.FECHAYRELOJ,FECHARELOJ);

			String CANTIDAD ="2";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CANTIDAD, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CANTIDAD);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CANTIDAD,CANTIDAD);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.AGREGARMONITOR, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.AGREGARMONITOR);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_COMPRAS, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_COMPRAS);
			//selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_VERCARRITO, 20);
			//selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_VERCARRITO);			
	        sleep(20);  	        
			
			//String VerObjeto1="iMac";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.OBJETO1, 20);
			//selenium.findElement(By.id(VerObjeto1)).click();
			
			//String VerObjeto2="iPod Classic";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.OBJETO2, 20);
			//selenium.findElement(By.id(VerObjeto2)).click();		
			
			//selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_COMPRAS, 20);
			//selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_COMPRAS);
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CHECKOUT, 20);
			
			boolean opcion1 = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CHECKOUT, 10);

			if(opcion1){
				selenium.manualCheck("Productos_añadidos_carrito", true);
				selenium.takeScreenshotRQM("Objetos_Agregados_OK");
			}else{
				selenium.manualCheck("Objetos_No_encontrados", false);
			}		
			selenium.endCaseOk();
			
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CHECKOUT);			
	        sleep(20);		
			
	        String IngresarCorreo="harry.rodriguez.02@gmail.com";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.INGRESAR_CORREO, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.INGRESAR_CORREO);
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.INGRESAR_CORREO,IngresarCorreo);
	        String IngresarClave="PruebaQA";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.INGRESAR_CLAVE, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.INGRESAR_CLAVE);			
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.INGRESAR_CLAVE,IngresarClave);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_INGRESAR);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_DETALLE_FACTURACION, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_DETALLE_FACTURACION);			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_DETALLE_ENTREGA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_DETALLE_ENTREGA);		
			
			//String CostoDespacho="Flat Shipping Rate - $5.00";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.COSTO_DESPACHO, 20);
			//selenium.findElement(By.id(CostoDespacho)).click();
			
			boolean Enable = selenium.findElement(By.xpath("/html/body/div[2]/div/div/div/div[4]/div[2]/div/div[1]/label")).isEnabled();
			System.out.println("Flat Shipping Rate - $5.00"+Enable);
			
			boolean Flat = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.COSTO_DESPACHO, 10);
			
			if(Flat){
				selenium.manualCheck("Costo_y_Despacho", true);
				selenium.takeScreenshotRQM("Costo_y_Despacho_OK");
			}else{
				selenium.manualCheck("Costo_y_Despacho_No_encontrado", false);
			}		
			selenium.endCaseOk();
			
			String ComentarioEntrega="PruebaQAHARRY";
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.COMENTARIO_METODOENTREGA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.COMENTARIO_METODOENTREGA);				
			selenium.setText(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.COMENTARIO_METODOENTREGA,ComentarioEntrega);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_METODOENTREGA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_METODOENTREGA);			
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECK_TRANSFERENCIABANCARIA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECK_TRANSFERENCIABANCARIA);			
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECK_TERMINOSYCONDICIONES, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CHECK_TERMINOSYCONDICIONES);				
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_METODOPAGO, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_METODOPAGO);				
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.HISTORIAL_ORDEN1, 20);			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.HISTORIAL_ORDEN2, 20);				
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.HISTORIAL_MODEL1, 20);				
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.HISTORIAL_MODEL2, 20);
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CONFIRMARORDEN, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CONFIRMARORDEN);				
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CONTINUAR_FINAL, 20);
					    
			boolean ORDEN = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CONTINUAR_FINAL, 10);

			if(ORDEN){
				selenium.manualCheck("ORDEN_COMPLETADA", true);
				selenium.takeScreenshotRQM("ORDEN_COMPLETADA_OK");
			}else{
				selenium.manualCheck("ORDEN_ERROR", false);
			}
					
			selenium.endCaseOk();
		
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_CONTINUAR_FINAL);	

			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_MICUENTA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_MICUENTA);				
			sleep(10);
	
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.DESPLEGABLE_MICUENTA, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.DESPLEGABLE_MICUENTA);				
			sleep(10);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_ORDER_HISTORY, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.BOTON_ORDER_HISTORY);				
			sleep(10);
			
			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.PAGINACUENTA, 20);
			boolean HISTORIAL = selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.PAGINACUENTA, 10);

			if(HISTORIAL){
				selenium.manualCheck("HISTORIAL_PEDIDOS", true);
				selenium.takeScreenshotRQM("HISTORIAL_PEDIDOS_OK");
			}else{
				selenium.manualCheck("HISTORIAL_PEDIDOS_ERROR", false);
			}
			selenium.endCaseOk();
			sleep(10);

			selenium.existElement(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CERRARSESION, 20);
			selenium.click(Locator_Harry_Rodriguez.Desafio_QA.Desafio_QA_Apple.CERRARSESION);
			
		}
		catch (Exception e)
		{					
			selenium.endCaseError(e);
			throw e;			
		} 
		finally
		{
			selenium.saveLog();			
			
		}		
	}

	private void sleep(int i) {
		// TODO Apéndice de método generado automáticamente
		
	}		
}