class ClasseUno {
    int x;
    ClasseUno(int x) {
        this.x = x;
    }
    int getValue() {
        return x;
    }
    int getValueUno() {
        return x;
    }
}

class ClasseDue extends ClasseUno {
    int y;
    ClasseDue(int x, int y) {
        super(x);
        this.y = y;
    }
    int getValue() {
        return y + super.getValue();
    }
    int getValueDue() {
        return y + super.getValue();
    }
}

class ClasseTre {
    String z;
    ClasseTre(String z) {
        this.z = z;
    }
    String getValue() {
        return z;
    }
}

class ProvaArray {
    public static void main(String[] args) {
        ClasseUno[] arrayClasseUno;
        ClasseDue[] arrayClasseDue;
        ClasseTre[] arrayClasseTre;
        ClasseDue[] arrayClasseDueBis;
        arrayClasseDue = new ClasseDue[] {new ClasseDue(2,3),
                                          new ClasseDue(3,4)};
        arrayClasseUno = arrayClasseDue;
        arrayClasseUno[0] = new ClasseUno(2);
        arrayClasseDueBis = (ClasseDue[]) arrayClasseUno;
        arrayClasseTre = new ClasseTre[] {new ClasseTre("ab"),
                                          new ClasseTre("cd")};
        //arrayClasseUno = arrayClasseTre;
        for (int i=0; i < arrayClasseUno.length; i++)
            System.out.println("Val. " + i + " : " + arrayClasseUno[i].getValue());
        System.out.println("Value 0: " + arrayClasseUno[0].getValueUno() + "\n");
        for (int i=0; i < arrayClasseDue.length; i++)
            System.out.println("Val. " + i + " : " + arrayClasseDue[i].getValue());
        System.out.println("Value 0: " + arrayClasseDue[0].getValueDue() + "\n");
        for (int i=0; i < arrayClasseDueBis.length; i++)
            System.out.println("Val. " + i + " : " + arrayClasseDueBis[i].getValue());
        System.out.println("Value 0: " + arrayClasseDueBis[0].getValueUno());
        System.out.println("Value 0: " + arrayClasseDueBis[0].getValueDue() + "\n");
        for (int i=0; i < arrayClasseTre.length; i++)
            System.out.println("Val. " + i + " : " + arrayClasseTre[i].getValue());
    }
}
