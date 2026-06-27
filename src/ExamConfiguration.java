public class ExamConfiguration {
    private String title;
    private int duration;
    private int passingScore;
    private boolean negativeMarking;
    private boolean questionShuffle;
    private boolean autoSubmit;
    private boolean calculatorAllowed;

    // Only the Builder creates one — keeps the object immutable from the outside.
    ExamConfiguration() {}

    public String getTitle()              {
        return title;
    }
    public int    getDuration()           {
        return duration;
    }
    public int    getPassingScore()       { return passingScore; }
    public boolean isNegativeMarking()    { return negativeMarking; }
    public boolean isQuestionShuffle()    { return questionShuffle; }
    public boolean isAutoSubmit()         { return autoSubmit; }
    public boolean isCalculatorAllowed()  { return calculatorAllowed; }

    // Used by ExamBuilder only.
    void setTitle(String title)                  { this.title = title; }
    void setDuration(int duration)               { this.duration = duration; }
    void setPassingScore(int passingScore)       { this.passingScore = passingScore; }
    void setNegativeMarking(boolean v)           { this.negativeMarking = v; }
    void setQuestionShuffle(boolean v)           { this.questionShuffle = v; }
    void setAutoSubmit(boolean v)                { this.autoSubmit = v; }
    void setCalculatorAllowed(boolean v)         { this.calculatorAllowed = v; }
}