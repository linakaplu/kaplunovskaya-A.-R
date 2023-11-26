class ApplianceFactory<T extends Appliance> {
    private Class<T> type;

    public ApplianceFactory(Class<T> type) {
        this.type = type;
    }

    public T createAppliance() {
        try {
            // Используем переданный тип для создания экземпляра объекта
            return type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}