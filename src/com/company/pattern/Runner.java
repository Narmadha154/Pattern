package com.company.pattern;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the program number:");
        int number=sc.nextInt();
        switch(number) {
            case 1:
                PyramidPattern pattern = new PyramidPattern();
                pattern.printPyramid();
                break;
            case 2:
                RightTrianglePattern pat = new RightTrianglePattern();
                pat.printRightTriangle();
                break;
            case 3:
                LeftTriangle left = new LeftTriangle();
                left.printLeftTriangle();
                break;
            case 4:
                DiamondPattern dia= new DiamondPattern();
                dia.printDiamond();
                break;
            case 5:
                RightPascal pascal= new RightPascal();
                pascal.printRightPascal();
                break;
            case 6:
                SandGlass glass= new SandGlass();
                glass.printSandGlass();
                break;
            case 7:
                Triangle tri= new Triangle();
                tri.printTriangle();
                break;
            case 8:
                DiamondPat diaPat= new DiamondPat();
                diaPat.printDia();
                break;
            case 9:
                SimpleNumber num= new SimpleNumber();
                num.printSimpleNumber();
                break;
            case 10:
                PascalTriangle pasTri= new PascalTriangle();
                pasTri.pascalTri();
                break;
            case 11:
                DiamondNumber diaNum= new DiamondNumber();
                diaNum.printDiamondNum();
                break;
            case 12:
                PrintXO print= new PrintXO();
                print.printXOPattern();
                break;
            case 13:
                LookAndSay lookSay= new LookAndSay();
                lookSay.printLookAndSay();
                break;
            case 14:
                SpiralPattern printSpi= new SpiralPattern();
                printSpi.printSpiral();
                break;
            case 15:
                SpiralPatternModification printSpiModify= new SpiralPatternModification();
                printSpiModify.printSpiralModify();
                break;
            case 16:
                ZPattern printZ= new ZPattern();
                printZ. printZPattern();
                break;
            case 17:
                ArrayPattern priArr= new ArrayPattern();
                priArr. printArray();
                break;
            default:
                System.out.println("no program");
        }
    }
}
