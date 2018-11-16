package io.mosip.registration.processor.packet.scanner.job.exception;


import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.registration.processor.core.exception.util.PlatformErrorCodes;

/**
 * The Class FTPNotAccessibleException.
 */
public class FTPNotAccessibleException extends BaseUncheckedException {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new FTP not accessible exception.
	 *
	 * @param errorMessage the error message
	 */
	public FTPNotAccessibleException(String errorMessage) {
		super(PlatformErrorCodes.RPR_PSJ_FTP_FOLDER_NOT_ACCESSIBLE, errorMessage);
	}

	/**
	 * Instantiates a new FTP not accessible exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public FTPNotAccessibleException(String message, Throwable cause) {
		super(PlatformErrorCodes.RPR_PSJ_FTP_FOLDER_NOT_ACCESSIBLE+ EMPTY_SPACE, message, cause);
	}


}
