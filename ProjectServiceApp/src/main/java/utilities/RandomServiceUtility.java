package utilities;

import java.util.Locale;

import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class RandomServiceUtility {
	
	public static String fakerSendUserName(){
		Faker faker = new Faker();
		String userName=faker.name().username();
		return userName;
		}
	
	public static String fakerSendTextEmail(){
		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		String email=fakeValuesService.bothify("????##@gmail.com");
		return email;
		}
	
	public static String fakerSendFirstName(){
		Faker faker = new Faker();
		String firstName=faker.name().firstName();
		return firstName;
		}
	
	public static String fakerSendMiddleName(){
		Faker faker = new Faker();
		String middleName=faker.name().nameWithMiddle();
		return middleName;
		}
	
	public static String fakerSendlastName(){
		Faker faker = new Faker();
		String lastName=faker.name().lastName();
		return lastName;
		}
	
	public static String fakerSendAddress(){
		Faker faker = new Faker();
		String address=faker.address().city();
		return address;
		}
	
	public static String fakerSendPhoneNumber(){
		Faker faker = new Faker();
		String phoneNumber=faker.phoneNumber().cellPhone();
		return phoneNumber;
		}
	
	public static String fakerSendNation(){
		Faker faker = new Faker();
		String nation=faker.nation().nationality();
		return nation;
		}
	}
