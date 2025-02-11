//package Ex_02;
//
//import java.util.Scanner;
//
//public class Main2 {
//    public static Veiculo criarVeiculo() {
//        Scanner input = new Scanner(System.in);
//        String veiculo;
//        System.out.println("*** Qual tipo de veiculo você quer montar?");
//        System.out.println("Carro, moto ou caminhão");
//        veiculo = input.next();
//
//        String marca;
//        String modelo;
//        String combustivel;
//        int anoFabricacao;
//        int potencia;
//        int cilindrada;
//        TipoCombustivel tipoCombustivel = null;
//        double litros100km;
//
//        System.out.println("Qual a marca?");
//        marca = input.next();
//        System.out.println("Qual o modelo:");
//        modelo = input.next();
//        System.out.println("Qual o ano de fabricação:");
//        anoFabricacao = input.nextInt();
//        System.out.println("Qual a potência:");
//        potencia = input.nextInt();
//        System.out.println("Qual a cilindrada:");
//        cilindrada = input.nextInt();
//        System.out.println("Qual os litros aos 100");
//        litros100km = input.nextDouble();
//
//        switch (veiculo) {
//            case "carro":
//                int qtdPassageiros;
//                System.out.println("Qual o tipo de combustível:");
//                combustivel = input.next();
//                switch (combustivel) {
//                    case "gasolina":
//                        tipoCombustivel = TipoCombustivel.GASOLINA;
//                        break;
//                    case "diesel":
//                        tipoCombustivel = TipoCombustivel.DIESEL;
//                        break;
//                    case "gpl":
//                        tipoCombustivel = TipoCombustivel.GPL;
//                        break;
//                    case "eletrico":
//                        tipoCombustivel = TipoCombustivel.ELETRICO;
//                        break;
//                }
//                System.out.println("Qual a quantidade de passageiros?");
//                qtdPassageiros = input.nextInt();
//                return new Carro(marca, modelo, anoFabricacao, potencia, cilindrada, tipoCombustivel, litros100km, qtdPassageiros);
//                case "moto":
//                    System.out.println("Qual o tipo de combustível:");
//                    combustivel = input.next();
//                    switch (combustivel) {
//                        case "gasolina":
//                            tipoCombustivel = TipoCombustivel.GASOLINA;
//                            break;
//                        case "diesel":
//                            tipoCombustivel = TipoCombustivel.DIESEL;
//                            break;
//                        case "gpl":
//                            tipoCombustivel = TipoCombustivel.GPL;
//                            break;
//                        case "eletrico":
//                            tipoCombustivel = TipoCombustivel.ELETRICO;
//                            break;
//                    }
//                    return new Mota(marca, modelo, anoFabricacao, potencia, cilindrada, tipoCombustivel, litros100km);
//            case "caminhão":
//                double capacidadeCarga;
//                System.out.println("Qual a capacidade máxima de carga?");
//                capacidadeCarga = input.nextInt();
//                System.out.println("Qual o tipo de combustível:");
//                combustivel = input.next();
//                switch (combustivel) {
//                    case "gasolina":
//                        tipoCombustivel = TipoCombustivel.GASOLINA;
//                        break;
//                    case "diesel":
//                        tipoCombustivel = TipoCombustivel.DIESEL;
//                        break;
//                    case "gpl":
//                        tipoCombustivel = TipoCombustivel.GPL;
//                        break;
//                    case "eletrico":
//                        tipoCombustivel = TipoCombustivel.ELETRICO;
//                        break;
//                }
//                return new Caminhao(marca, modelo, anoFabricacao, potencia, cilindrada, tipoCombustivel, litros100km, capacidadeCarga);
//        }
//
//
//    }
//}
