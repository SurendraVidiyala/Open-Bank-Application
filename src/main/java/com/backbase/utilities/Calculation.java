package com.backbase.utilities;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.backbase.dto.BackbaseResponseBody;

/**
 * Class consisting of methods to perform all sorts of business calculations
 * 
 * @author Arka Bhattacharya
 *
 */
public class Calculation {
	private static final Logger LOGGER = Logger.getLogger(Calculation.class);

	/**
	 * Total Amount calculator for the selected transaction type
	 * 
	 * @param
	 * @return Total in String format
	 */
	public static String getTotalAmount(ArrayList<BackbaseResponseBody> backbaseResponseBodyList) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("getTotalAmount is executed with backbaseResponseBodyList=[" + backbaseResponseBodyList + "]");
		}

		BigDecimal totalBigDecimalValue = new BigDecimal(ApplicationConstants.ZERO_DECIMAL_STRING);

		if (null == backbaseResponseBodyList)
			return ApplicationConstants.ZERO_DECIMAL_STRING;
		else {
			for (BackbaseResponseBody backbaseResponseBodyIterator : backbaseResponseBodyList) {
				if (null != backbaseResponseBodyIterator.getTransactionAmount())
					totalBigDecimalValue = totalBigDecimalValue
							.add(new BigDecimal(backbaseResponseBodyIterator.getTransactionAmount()));
			}
		}
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Exiting getTotalAmount with total=[" + totalBigDecimalValue.toString() + "]");
		}
		return totalBigDecimalValue.toString();
	}
}
