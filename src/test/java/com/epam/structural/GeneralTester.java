package com.epam.structural;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.epam.patterns.bridge.CanonPrinter;
import com.epam.patterns.bridge.EpsonPrinter;
import com.epam.patterns.decorator.AppleDecorator;
import com.epam.patterns.facade.MeatFacade;
import com.epam.patterns.flyweight.Restaurant;
import com.epam.patterns.model.Apple;
import com.epam.patterns.model.Component;
import com.epam.patterns.model.Document;
import com.epam.patterns.model.Lunch;
import com.epam.patterns.model.Plant;
import com.epam.patterns.model.Potato;
import com.epam.patterns.model.Printer;
import com.epam.patterns.model.Scanner;
import com.epam.patterns.proxy.PotatoProxy;

public class GeneralTester {

	@Before
	public void before() {
		System.out.println("=====================");
	}

	@After
	public void after() {
		System.out.println("=====================");
	}

	@Test
	public void testBridge() {
		EpsonPrinter epsonPrinter = new EpsonPrinter();
		epsonPrinter.print(new Document("epson document"));

		CanonPrinter canonPrinter = new CanonPrinter();
		canonPrinter.print(new Document("Canon printer"));
	}

	@Test
	public void testDecorator() {
		Plant apple = new Apple();
		apple.consume();

		AppleDecorator appleAdv = new AppleDecorator();
		appleAdv.consume();
		appleAdv.cut();
	}

	@Test
	public void testFacade() {
		MeatFacade facade = new MeatFacade();
		facade.consumeBeef();
		facade.consumeChicken();
		facade.consumePork();
		facade.fryBeef();
	}

	@Test
	public void testFlyweight() {
		Lunch lunch = Restaurant.getLunch("first");
		System.out.println(lunch);
		lunch = Restaurant.getLunch("second");
		System.out.println(lunch);
		lunch = Restaurant.getLunch("first");
		System.out.println(lunch);
		lunch = Restaurant.getLunch("third");
		System.out.println(lunch);
	}

	@Test
	public void testProxy() {
		Potato potato = new Potato();
		potato.consume();
		potato.wash();

		PotatoProxy potatoProxy = new PotatoProxy("start", "success!");
		potatoProxy.consume();
		potatoProxy.wash();
	}

	@Test
	public void testComposite() {
		Component component = new Component("The First");
		component.setComponents(Arrays.asList(new Component[] { new Component("fsf"), new Component("second") }));
	}

	@Test
	public void testAdapter() {
		Printer printer = new Printer();
		Scanner scanner = new Scanner();

		printer.print(new Document("printed"));
		scanner.copy();
		System.out.println(scanner.scan());
	}
}
