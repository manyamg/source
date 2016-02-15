package swip.ch17datepicker.jquerydatepicker.v3;

import java.time.LocalDate;
import java.time.Month;


public class JQueryDatepicker {

    private JQueryCalendar calendar;
    private JQueryYearPicker yearControl;
    private JQueryMonthPicker monthControl;
    private JQueryDayPicker dayPicker;

    public JQueryDatepicker(JQueryCalendar calendar,
                            JQueryYearPicker yearControl,
                            JQueryMonthPicker monthControl,
                            JQueryDayPicker dayPicker) {
        this.calendar = calendar;
        this.yearControl = yearControl;
        this.monthControl = monthControl;
        this.dayPicker = dayPicker;
    }

    public void pick(Month month, int day, int year) {
        LocalDate.of(year, month.ordinal() + 1, day);
        calendar.show();
        yearControl.pickYear(year);
        monthControl.pickMonth(month.ordinal());
        dayPicker.pickDay(day);
    }

}
