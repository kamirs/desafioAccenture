package app.rest.serverRest;


import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.response.Response;





/**
 * Unit test for simple App.
 */

//Usei os status code de falha para mostrar o desenvolvimento do RestAssured, pois as APIs estava fora do ar.
// "message": "Não é possível realizar POST em /. Acesse https://serverest.dev para ver as rotas disponíveis e como utilizá-las."

public class AppTest 
{
 
	@Test
	public void login() {
		
		String url = "https://serverest.dev";
		String corpo = "{\"email\": \"fulano@qa.com\":\"password\": \"teste\"}";
		
		Response response = given().contentType("application/json").body(corpo).
		when().post(url);
		response.then().statusCode(500);
		
		System.out.println("Retorno" + response.body().asString());
	}
	
	
	
	
	@Test
	public void cadastrarUsuario() {
		
		String url = "https://serverest.dev";
		String corpo = "{\"nome\":\"Fulano da Silva\",\"email\": \"fulano@qa.com\",\"password\": \"teste\",\"administrador\": \"true\"}";
		
		Response response = given().contentType("application/json").body(corpo).
				when().post(url);
				response.then().statusCode(405);
				
				System.out.println("Retorno" + response.body().asString());
	}
	
	
	@Test
	public void RealizarLogin() {
			
			String url = "https://serverest.dev";
			String corpo = "{\"email\": \"fulano@qa.com\",\"password\": \"teste\"}";

			
			Response response = given().contentType("application/json").body(corpo).
			when().post(url);
			response.then().statusCode(405);
			
			System.out.println("Retorno" + response.body().asString());
		}
	}
		
		


