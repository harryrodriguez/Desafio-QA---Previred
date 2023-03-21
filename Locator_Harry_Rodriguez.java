package Locators;
import resources.Locators.Locator_Harry_RodriguezHelper;
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

import org.openqa.selenium.By;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;

public class Locator_Harry_Rodriguez extends Locator_Harry_RodriguezHelper
{
	
		public static class Desafio_QA
		{		
		public static class Desafio_QA_Apple
		{
		//Pantalla Ingreso a Portal
			public static final By LOGO_PAGINA = By.id("logo");	
			public static final By BUSCADOR = By.name("search");
			public static final By BOTON_BUSCAR = By.xpath("/html/body/header/div/div/div[2]/div/span/button/i");
			public static final By IPODCLASSIC_ADD = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]");
			public static final By IMAC_ADD = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]");
		//Carrito de compra	
			public static final By BOTON_COMPRAS = By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/i");			
			public static final By BOTON_VERCARRITO = By.xpath("/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]/strong");
			public static final By OBJETO1 = By.xpath("/html/body/div[2]/div/div/form/div/table/tbody/tr[1]/td[2]/a");
			public static final By OBJETO2 = By.xpath("/html/body/div[2]/div/div/form/div/table/tbody/tr[2]/td[2]/a");
			public static final By BOTON_CHECKOUT = By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/a");
			public static final By BOTON_CONTINUAR = By.id("button-account");
		//Registro de cuenta	
			public static final By REGISTRAR_CUENTA = By.id("collapse-checkout-option");
			public static final By REG_NOMBRE = By.xpath("//*[@id='input-payment-firstname']");
			public static final By REG_APELLIDO = By.xpath("//*[@id='input-payment-lastname']");
			public static final By REG_CORREO = By.xpath("//*[@id='input-payment-email']");
			public static final By REG_TELEFONO = By.xpath("//*[@id='input-payment-telephone']");
			public static final By REG_COMPAÑIA = By.xpath("//*[@id='input-payment-company']");
			public static final By REG_DIRECCION = By.xpath("//*[@id='input-payment-address-1']");
			public static final By REG_DIRECCION1= By.xpath("//*[@id='input-payment-address-2']");
			public static final By REG_CIUDAD = By.xpath("//*[@id='input-payment-city']");
			public static final By REG_CODIGOPOSTAL = By.xpath("//*[@id='input-payment-postcode']");
			public static final By REG_PAIS = By.xpath("//*[@id='input-payment-country']");
			public static final By REG_REGION = By.xpath("//*[@id='input-payment-zone']");
			public static final By REG_CLAVE = By.xpath("//*[@id='input-payment-password']");
			public static final By REG_CONFIRMARCLAVE = By.xpath("//*[@id='input-payment-confirm']");
			public static final By HE_LEIDO = By.name("agree");
			public static final By BOTON_CONTINUAR_REGISTRO = By.id("button-register");
		//Ingresar a cuenta	
			public static final By INGRESAR_CORREO = By.id("input-email");
			public static final By INGRESAR_CLAVE = By.id("input-password");
			public static final By BOTON_INGRESAR = By.id("button-login");
		//Confirmar datos y pago
			public static final By BOTON_DETALLE_FACTURACION = By.xpath("//*[@id='button-payment-address']");
			public static final By COSTO_DESPACHO = By.xpath("/html/body/div[2]/div/div/div/div[4]/div[2]/div/div[1]/label");			
			public static final By BOTON_DETALLE_ENTREGA = By.xpath("//*[@id='button-shipping-address']");
			public static final By COMENTARIO_METODOENTREGA = By.xpath("/html/body/div[2]/div/div/div/div[4]/div[2]/div/p[4]/textarea");
			public static final By BOTON_METODOENTREGA= By.xpath("//*[@id='button-shipping-method']");
			public static final By CHECK_TRANSFERENCIABANCARIA = By.xpath("/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[1]/label/input");
			public static final By CHECK_TERMINOSYCONDICIONES = By.xpath("/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div/input[1]");
			public static final By BOTON_METODOPAGO = By.xpath("//*[@id='button-payment-method']");
		//Historial de compra
			public static final By HISTORIAL_ORDEN1 = By.xpath("/html/body/div[2]/div/div/div/div[6]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/a");
			public static final By HISTORIAL_ORDEN2 = By.xpath("/html/body/div[2]/div/div/div/div[6]/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/a");
			public static final By HISTORIAL_MODEL1 = By.xpath("/html/body/div[2]/div/div/div/div[6]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]");
			public static final By HISTORIAL_MODEL2 = By.xpath("/html/body/div[2]/div/div/div/div[6]/div[2]/div/div[1]/table/tbody/tr[2]/td[2]");
			public static final By BOTON_CONFIRMARORDEN = By.xpath("//*[@id='button-confirm']");
			public static final By BOTON_CONTINUAR_FINAL = By.xpath("/html/body/div[2]/div/div/div/div/a");
		//MI CUENTA
			public static final By BOTON_MICUENTA = By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/i");
			public static final By DESPLEGABLE_MICUENTA = By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");		
			public static final By BOTON_ORDER_HISTORY = By.xpath("/html/body/div[2]/div/div/ul[2]/li[1]/a");	
			public static final By PAGINACUENTA = By.xpath("/html/body/div[2]/div/div/h1");		
			public static final By CERRARSESION = By.xpath("/html/body/div[2]/div/aside/div/a[13]");	
		//PUNTO EXTRA
			public static final By CINEMA_ADD = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]");	
			public static final By CHECK_RADIO = By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div/div/label/input");	
			public static final By CHECKBOX_3 = By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/label/input");	
			public static final By CHECKBOX_4 = By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/label/input");
			public static final By TEXTO = By.xpath("//*[@id='input-option208']");
			public static final By SELECT_DESPLEGABLE = By.xpath("//*[@id='input-option217']");	
			public static final By TEXTAREA = By.xpath("//*[@id='input-option209']");
			public static final By ARCHIVO = By.xpath("//*[@id='button-upload222']");
			public static final By FECHA = By.xpath("//*[@id='input-option219']");
			public static final By TIEMPO = By.xpath("//*[@id='input-option221']");
			public static final By FECHAYRELOJ = By.xpath("//*[@id='input-option220']");
			public static final By CANTIDAD = By.xpath("//*[@id='input-quantity']");
			public static final By AGREGARMONITOR= By.xpath("//*[@id='button-cart']");
			public static final By YELLOW = By.xpath("//*[@id='input-option217']/option[5]");			
		}

		}
		public String enviromentHarry(String enviroment){
			switch (enviroment) {
			case "Desafio_QA":
				enviroment = "http://opencart.abstracta.us/";
				break;
			default:
				break;
			}
			return enviroment;
		}	
		
		
		}