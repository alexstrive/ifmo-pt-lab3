package ifmo.pt.lab3;

class ThirdExercise {
    public static void main(String... args) {
        var line = "Конфеты `Маска`;45;120";
        var item_fld = line.split(";");
        System.out.println("Массив, полученный из строк: " + java.util.Arrays.toString(item_fld));
        var foodItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));

        System.out.println(foodItem);
    }
}