class DefaultValues {
    byte DefaultByte;
    short DefaultShort;
    int DefaultInt;
    long DefaultLong;
    float DefaultFloat;
    double DefaultDouble;
    boolean DefaultBoolean;
    char DefaultChar;
    public static void main(String args[]){
        DefaultValues obj = new DefaultValues();
        System.out.println("Default values of all primitive data types");
        System.out.println("byte:"+ obj.DefaultByte);
        System.out.println("short:"+ obj.DefaultShort);
        System.out.println("int:"+ obj.DefaultInt);
        System.out.println("long:"+ obj.DefaultLong);
        System.out.println("float:"+ obj.DefaultFloat);
        System.out.println("double:"+ obj.DefaultDouble);
        System.out.println("boolean:"+ obj.DefaultBoolean);
        System.out.println("char:"+ obj.DefaultChar);
    }
}