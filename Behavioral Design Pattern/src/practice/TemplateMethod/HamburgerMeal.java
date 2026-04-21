package practice.TemplateMethod;

public class HamburgerMeal extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Mua bánh mì kẹp thịt, bánh mì và khoai tây chiên");
    }

    @Override
    public void cook() {
        System.out.println("Nướng bánh mì kẹp thịt trên vỉ nướng và khoai tây chiên trong lò nướng");
    }

    @Override
    public void cleanup() {
        System.out.println("Vứt bỏ đĩa giấy");
    }
}
