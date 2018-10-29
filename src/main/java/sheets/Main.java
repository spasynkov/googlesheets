package sheets;

import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

public class Main {
	private static final String SPREADSHEET_ID = "1gkXZ5qay9vMFzjPqRzNEneCApHIcFo0p_lw1zyz780Q";

	public static void main(String[] args) throws IOException, GeneralSecurityException {
		ValueRange appendBody = new ValueRange()
				.setValues(Arrays.asList(Arrays.<Object>asList("1", "2")));
		AppendValuesResponse appendResult = SheetsServiceUtil.getSheetsService().spreadsheets().values()
				.append(SPREADSHEET_ID, "A9", appendBody)
				.setValueInputOption("USER_ENTERED")
				.setInsertDataOption("INSERT_ROWS")
				.setIncludeValuesInResponse(true)
				.execute();
	}
}
