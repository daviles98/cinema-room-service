class Army {

    public static void createArmy() {
        Unit u1 = new Unit("SEALS");
        Unit u2 = new Unit("Al-Qaeda");
        Unit u3 = new Unit("Axis");
        Unit u4 = new Unit("Phantom Troupe");
        Unit u5 = new Unit("Nirvana");

        Knight k1 = new Knight("Arthur");
        Knight k2 = new Knight("Braveheart");
        Knight k3 = new Knight("Guts");

        General g = new General("Heisenberg");
        Doctor doc = new Doctor("Law");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}