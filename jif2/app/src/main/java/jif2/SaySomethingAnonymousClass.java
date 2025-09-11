package jif2;

// 
public class SaySomethingAnonymousClass {
    public interface SaySomething {
        public String sayHi();
        public String sayBye();
        public String sayFavoriteMovie();
    }
  

    public String sayStuffAmericanEnglish() {
        /*
         * Anonymous classes enable you to make your code more concise. They enable * you to declare and instantiate a class at the same 
         * time. They are like local classes except that they do not have a name.  * Use them if you need to use a local class only once.
         */
        SaySomething greeting = new SaySomething() {
            public String sayHi() {
                return "Hello!";
            }
            public String sayBye() {
                return "Goodbye!";
            }
            public String sayFavoriteMovie() {
                return "My favorite movie is Spinal Tap.";
            }               
        };
        return greeting.sayHi() + " " + greeting.sayBye() + " " + greeting.sayFavoriteMovie();
    }

    public String sayStuffSpanish() {
        SaySomething greeting = new SaySomething() {
            public String sayHi() {
                return "Hola!";
            }
            public String sayBye() {
                return "Despedida!";
            }
            public String sayFavoriteMovie() {
                return "Mi película favorita es Spinal Tap.";
            }               
        };
        return greeting.sayHi() + " " + greeting.sayBye() + " " + greeting.sayFavoriteMovie();
    }
        
}
