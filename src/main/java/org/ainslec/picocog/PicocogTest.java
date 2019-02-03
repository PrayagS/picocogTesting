/*
 * @author Prayag Savsani AU1841035
 * @version dd/02/2019
 * Description: write purpose/ description of the program here
 */


package org.ainslec.picocog;

public class PicocogTest
{
    public static void main(String[] args)
    {
        PicoWriter w = new PicoWriter();

        w.writeln("int foo = calcFoo();");
        w.writeln("");
        w.writeln("// We shall dance here");
        w.writeln_r("if (foo == 0) {");
        w.writeln("sayHello();");
        w.writeln_lr("} else if (foo < 100) {");
        w.writeln("sayGoodbye();");
        w.writeln_lr("} else {");
        w.writeln("sayAnything();");
        w.writeln_l("}");

        System.out.println(w.toString());
    }
}

/* PROGRAM OUTPUT
 */
