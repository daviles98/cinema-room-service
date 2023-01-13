class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            double d = Double.parseDouble(input);
            return d;
        } catch (Exception e) {
            return 0;
        }
    }
}