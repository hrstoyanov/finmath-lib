package net.finmath.time;

import java.io.Serializable;
import java.time.LocalDate;

import net.finmath.modelling.descriptor.ScheduleDescriptor;
import net.finmath.time.ScheduleGenerator.DaycountConvention;
import net.finmath.time.ScheduleGenerator.Frequency;
import net.finmath.time.ScheduleGenerator.ShortPeriodConvention;
import net.finmath.time.businessdaycalendar.BusinessdayCalendar;
import net.finmath.time.businessdaycalendar.BusinessdayCalendar.DateRollConvention;

/**
 * Class to store any relevant information to generate schedules, which have different period structure but otherwise follow the same conventions.
 *
 * @author Christian Fries
 * @author Roland Bachl
 * @deprecated
 */
public class ScheduleMetaData extends SchedulePrototype {

	/**
	 * Construct the ScheduleMetaData.
	 *
	 * @param frequency The default frequency.
	 * @param daycountConvention The daycount convention.
	 * @param shortPeriodConvention If short period exists, have it first or last.
	 * @param dateRollConvention Adjustment to be applied to the all dates.
	 * @param businessdayCalendar Businessday calendar (holiday calendar) to be used for date roll adjustment.
	 * @param fixingOffsetDays Number of business days to be added to period start to get the fixing date.
	 * @param paymentOffsetDays Number of business days to be added to period end to get the payment date.
	 * @param isUseEndOfMonth If ShortPeriodConvention is LAST and startDate is an end of month date, all period will be adjusted to EOM. If ShortPeriodConvention is FIRST and maturityDate is an end of month date, all period will be adjusted to EOM.
	 */
	public ScheduleMetaData(Frequency frequency, DaycountConvention daycountConvention,
			ShortPeriodConvention shortPeriodConvention, DateRollConvention dateRollConvention,
			BusinessdayCalendar businessdayCalendar, int fixingOffsetDays, int paymentOffsetDays,
			boolean isUseEndOfMonth) {
		super(frequency, daycountConvention, shortPeriodConvention, dateRollConvention, businessdayCalendar, fixingOffsetDays,
				paymentOffsetDays, isUseEndOfMonth);
		// TODO Auto-generated constructor stub
	}

}

