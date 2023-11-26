class Survey extends Questionnaire {
    @Override
    protected void addQuestions() {
        questions.add("вам нравится наш сервис?");
        questions.add("какие ваши пожелания?");
    }
}