package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
// Creamos lista snacks
    List <Snack> snacks  = new ArrayList<>();
  public void agregarSnack (Snack snack) {
      snacks.add(snack);
  }
  public void mostrarSnacks () {
      System.out.println(snacks);
  }
  public void getSnacks (int indice) {
      snacks.get(indice);
  };
    }


