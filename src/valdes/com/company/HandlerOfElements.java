package valdes.com.company;

public class HandlerOfElements<T> implements IHandler<T> {
    private String textForAdd = "Добавлен элемент ";
    private String textForRemove = "Удален элемент";
    private String textForGet = "Получен элемент";
    private String textForOldEl = "Старый элемент ";
    private String textForUpdateEl = " был заменен на новый элемент ";

    @Override
    public void onAdding(T value) {
        System.out.println(textForAdd + value + "\n");
    }

    @Override
    public void onRemoving(T value) {
        System.out.println(textForRemove + value + "\n");
    }

    @Override
    public void onGetting(T value) {
        System.out.println(textForGet + value + "\n");
    }

    @Override
    public void onReplacing(T value1, T value2) {
        System.out.println(textForOldEl + value1 + textForUpdateEl + value2 + "\n");
    }
}
