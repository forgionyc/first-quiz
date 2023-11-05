package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
  private int balanceInCents;
  private Map<String, Integer> drinkPrices;

  public VendingMachineImpl() {
    this.balanceInCents = 0;
    this.drinkPrices = new HashMap<>();

    drinkPrices.put("ScottCola", 75);
    drinkPrices.put("KarenTea", 100);

  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    balanceInCents += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (!drinkPrices.containsKey(name)) {
      throw new UnknownDrinkException();
    }

    int price = drinkPrices.get(name);

    if (balanceInCents >= price) {
      balanceInCents -= price;
      return new Drink(name, !name.equals("KarenTea"));
    } else {
      throw new NotEnoughMoneyException();
    }
  }
}
