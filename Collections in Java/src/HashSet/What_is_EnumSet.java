package HashSet;

import com.sun.security.jgss.GSSUtil;

import java.util.EnumSet;
import java.util.Iterator;

public class What_is_EnumSet {

    enum lang {
        Java, Python, RUBY, Php,
    }

    public static void main(String[] args) {
        // Created a new enum set using EnumSet
        // Allof is used to print all
        EnumSet<lang> langs = EnumSet.allOf(lang.class);
        System.out.println(langs);

        // Empty Enum set
        EnumSet<lang> l = EnumSet.noneOf(lang.class);
        System.out.println(l);

        // RAnge Enum Set : (from , to)
        EnumSet<lang> range = EnumSet.range(lang.Java, lang.RUBY);
        System.out.println(range);

        // Print one value in Enum Set
        EnumSet<lang> oneval = EnumSet.of(lang.RUBY);
        System.out.println(oneval);

        //Print multiple value in Enum Set
        EnumSet<lang> mulval = EnumSet.of(lang.Php,lang.Java);
        System.out.println(mulval);

        // Add and AddAll
        EnumSet<lang> lang1 = EnumSet.allOf(lang.class);
        EnumSet<lang> lang2 = EnumSet.noneOf(lang.class);
        System.out.println("Lang1 is " + lang1 + " === " + "Lang2 is " + lang2);

        lang2.add(lang.Java);
        lang2.addAll(lang1);
        System.out.println(lang2);

        // How to iterate EnumSet : iterator
        EnumSet<lang> fulllang = EnumSet.allOf(lang.class);
        Iterator<lang> it = fulllang.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(" , ");
        }

        // Remove and RemoveAll
        EnumSet<lang> newLang = EnumSet.allOf(lang.class);
        Boolean b = newLang.remove(lang.Java);
        System.out.println("\n" + b);
        System.out.println(newLang);

//        EnumSet<lang> removeAll = newLang.removeAll(newLang.class);
//        System.out.println(newLang);

        Boolean bo = newLang.removeAll(newLang);
        System.out.println(newLang);
        System.out.println(bo);
    }
}
