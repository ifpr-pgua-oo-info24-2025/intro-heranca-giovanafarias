package com.lin.java;
import com.lin.java.models.*;
import java.util.Scanner;

// Aluna: Giovana Farias

public class App {
  public static void main(String[] args) {
    Carro carro = new Carro("", "", 0, 0);
    Moto moto = new Moto("", "", 0, "");
    Scanner scan = new Scanner(System.in);
    int op = -1, flag = 0;

    do {

      if(flag == 0) firstOps();
      else secondOps();
      op = scan.nextInt();

      switch(op) {

        case 1:
          scan.nextLine(); // esses scans de vez em quando são para limpar o buffer ok!!

          System.out.println("Digite a marca do carro: ");
          carro.setMarca(scan.nextLine());

          System.out.println("Digite o modelo do carro: ");
          carro.setModelo(scan.nextLine());

          System.out.println("Digite o ano do carro: ");
          carro.setAno(scan.nextInt());
          
          scan.nextLine();  

          System.out.println("Digite o número de portas: ");
          carro.setNumeroDePortas(scan.nextInt());

          flag = 1;

          break;

        case 2:
          scan.nextLine();  

          System.out.println("Digite a marca da moto: ");
          moto.setMarca(scan.nextLine());

          System.out.println("Digite o modelo da moto: ");
          moto.setModelo(scan.nextLine());

          System.out.println("Digite o ano da moto: ");
          moto.setAno(scan.nextInt());
          
          scan.nextLine();  

          System.out.println("Digite o tipo de guidão da moto: ");
          moto.setTipoDeGuidao(scan.nextLine());
          
          flag = 2;

          break;
          
        case 3:
          if (flag == 1) {
            System.out.println(carro.exibirDetalhes());
          } else {
            System.out.println(moto.exibirDetalhes());
          }

          break;

        case 0:
          op = 0;
          break;
      }

    } while (op != 0);

    scan.close();

  }

  public static void firstOps() {
    System.out.println("-------------------------------------\n");
    System.out.println("--------   MENU DO VEÍCULO   --------\n");
    System.out.println("-------------------------------------\n");
    System.out.println("-- Adicione dados sobre um veículo --\n");
    System.out.println("--   1) Carro                      --\n");
    System.out.println("--   2) Moto                       --\n");
    System.out.println("--   0) Sair                       --\n");
    System.out.println("-------------------------------------\n");
  }

  public static void secondOps() {
    System.out.println("-------------------------------------\n");
    System.out.println("--------   MENU DO VEÍCULO   --------\n");
    System.out.println("-------------------------------------\n");
    System.out.println("--  3) Exibir detalhes do veículo  --\n");
    System.out.println("--  0) Sair                        --\n");
    System.out.println("-------------------------------------\n");
  }

}
