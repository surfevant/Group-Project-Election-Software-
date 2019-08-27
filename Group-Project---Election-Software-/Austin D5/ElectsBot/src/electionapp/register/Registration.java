package electionapp.register;

 class Registration {

     Registration() {
     }

     boolean validateInput(String[] userInfo){
        int counter = 0;
        for(String s : userInfo) {

            if (!(s.equals("") || s.equals("null"))){
                counter++;
            }

            System.out.print(s + ", ");
        }
        System.out.println(counter);
        return counter == 13;
    }


}
