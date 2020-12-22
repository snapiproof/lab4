public class Rocket extends Item implements GetCloser{
    public Rocket(String name) {
        super(name);
        this.name = name;
    }
    private String name;

    public void GetCloser(TextObject place){
        System.out.println(this.name + " get closer to " + place.getName());
    }

    public class Lift extends Item {
        protected TextObject place;
        public Lift(String name, TextObject place) {
            super(name);
            this.name = name;
            this.place = place;
        }
        private String name;
        protected boolean Open = false;



    }

    public class Cabin extends Item{
        public Cabin(String name) {
            super(name);
            this.name = name;
        }

        private String name;
    }

    public class Porthole extends Item{
        public Porthole(String name) {
            super(name);
            this.name = name;
        }
        public Porthole(String name, TextObject place) {
            super(name);
            this.name = name;
            this.place = place;
        }
        private TextObject place;
        private String name;
    }
    public class Tail extends Item{
        public Tail(String name) {
            super(name);
            this.name = name;
        }
        private String name;
    }

    public class ControlCabin extends Item{
        public ControlCabin(String name) {
            super(name);
            this.name = name;
        }
        private String name;

        public class Megaphone extends Item{
            public Megaphone(String name) {
                super(name);
                this.name = name;
            }
            private String name;
        }

    }

}