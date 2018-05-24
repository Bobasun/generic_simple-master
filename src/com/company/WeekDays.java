package com.company;

/**
 * Created by Brainacad4 on 09.04.2018.
 */
public enum WeekDays {
    SUNDAY(0) {
        public String toString()
        {
            return  "Most easy day of the week";
        }
    },
    MONDAY(5),
    THIRTHDAY(4),
    WEDNESDAY(3);

    private int hardValue;
    private WeekDays(int hardValue)
    {
        this.hardValue = hardValue;
    }

    public  int getHardValue()
    {
        return this.hardValue;
    }
}
