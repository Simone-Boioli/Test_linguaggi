public class EsisteSuccessivoChar2Demo{
    public static void main(String args[]) throws NonValidCharacterException{
        String str="hjdkwolvlanalpq";
        char keyboard='0';
        
        try{

            if(args.length==1 && args[0].length()==1){
                keyboard=args[0].charAt(0);

                    if((int)(keyboard)>=(int)('a') && (int)(keyboard)<=(int)('z')){
                    System.out.println("Fatto");
                }
                else{
                    throw new NonValidCharacterException();
                }
            }
            else{
                System.out.println("Errore, argomento.length != 1 oppure stringa con + caratteri");
            }
        
        }
        catch(NonValidCharacterException e){
            System.out.println(e);
        }
    }


    public static int conta2(String str,char k){
	if(str.length()==0){
		return 0;
	}
	else{
		int uguale=0;
		if (str.charAt(0)==k) uguale=1;
		return uguale+conta2(str.concat(0,str.length()-2),k);
	}
    }
}
