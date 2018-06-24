package com.backbase.utilities;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.backbase.dto.BackbaseResponseBody;
import com.backbase.dto.MonetaryValue;
import com.backbase.dto.OtherAccount;
import com.backbase.dto.Transaction;
import com.backbase.dto.Transactions;

/**
 * Mapper implementation class which contains method to map Transactions type of
 * object to an ArrayList of BackbaseResponseBody
 * 
 * @author Arka Bhattacharya
 *
 */
public class TransactionsToBackbaseResponseBodyMapper {
	private static final Logger LOGGER = Logger.getLogger(TransactionsToBackbaseResponseBodyMapper.class);

	/**
	 * Converter method to map and convert the response received from sandbox
	 * 
	 * @param
	 * @return ArrayList of BackbaseResponseBody
	 */
	public static ArrayList<BackbaseResponseBody> transactionsToBackbaseResponseBodyConverter(Transactions transactions,
			String filterkey) {

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(
					"transactionsToBackbaseResponseBodyConverter is executed with parameters: transactions.size()=["
							+ transactions.getTransactions().size() + "] & filterkey=[" + filterkey + "]");
		}

		ArrayList<BackbaseResponseBody> backbaseResponseBodyList = new ArrayList<BackbaseResponseBody>();

		for (Transaction transactionIterator : transactions.getTransactions()) {
			if (null == filterkey || (null != transactionIterator.getDetails()
					&& filterkey.equals(transactionIterator.getDetails().getType()))) {

				MonetaryValue tempValue = null;
				BackbaseResponseBody temp = new BackbaseResponseBody();
				OtherAccount tempOtherAccount = transactionIterator.getOtherAccount();

				if (null != transactionIterator.getDetails() && null == transactionIterator.getDetails().getValue())
					tempValue = transactionIterator.getDetails().getValue();

				if (null == transactionIterator.getId())
					temp.setId(null);
				else
					temp.setId(transactionIterator.getId());

				if (null == transactionIterator.getThisAccount()
						|| null == transactionIterator.getThisAccount().getId())
					temp.setAccountId(null);
				else
					temp.setAccountId(transactionIterator.getThisAccount().getId());

				if (null == tempOtherAccount || null == tempOtherAccount.getNumber())
					temp.setCounterpartyAccount(null);
				else
					temp.setCounterpartyAccount(tempOtherAccount.getNumber());

				if (null == tempOtherAccount || null == tempOtherAccount.getHolder()
						|| null == tempOtherAccount.getHolder().getName())
					temp.setCounterpartyName(null);
				else
					temp.setCounterpartyName(tempOtherAccount.getHolder().getName());

				if (null == tempOtherAccount || null == tempOtherAccount.getMetadata()
						|| null == tempOtherAccount.getMetadata().getImageURL())
					temp.setCounterPartyLogoPath(null);
				else
					temp.setCounterPartyLogoPath(transactionIterator.getOtherAccount().getMetadata().getImageURL());

				if (null == tempValue) {
					temp.setInstructedAmount(null);
					temp.setInstructedCurrency(null);
					temp.setTransactionAmount(null);
					temp.setTransactionCurrency(null);
				} else {

					if (tempValue.getAmount() == null) {
						temp.setInstructedAmount(null);
						temp.setTransactionAmount(null);
					} else {
						temp.setInstructedAmount(transactionIterator.getDetails().getValue().getAmount());
						temp.setTransactionAmount(transactionIterator.getDetails().getValue().getAmount());
					}

					if (tempValue.getCurrency() == null) {
						temp.setInstructedCurrency(null);
						temp.setTransactionCurrency(null);
					} else {
						temp.setInstructedCurrency(transactionIterator.getDetails().getValue().getCurrency());
						temp.setTransactionCurrency(transactionIterator.getDetails().getValue().getCurrency());
					}
				}

				if (null == transactionIterator.getDetails() || null == transactionIterator.getDetails().getType())
					temp.setTransactionType(null);
				else
					temp.setTransactionType(transactionIterator.getDetails().getType());

				if (null == transactionIterator.getDetails()
						|| null == transactionIterator.getDetails().getDescription())
					temp.setDescription(null);
				else
					temp.setDescription(transactionIterator.getDetails().getDescription());

				backbaseResponseBodyList.add(temp);
			}
		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Exiting transactionsToBackbaseResponseBodyConverter backbaseResponseBodyList.size()=["
					+ backbaseResponseBodyList.size() + "] for filterkey=[" + filterkey + "]");
		}
		return backbaseResponseBodyList;
	}

}
