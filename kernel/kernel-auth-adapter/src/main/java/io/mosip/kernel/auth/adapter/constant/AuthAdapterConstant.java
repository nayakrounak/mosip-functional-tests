/**
 * 
 */
package io.mosip.kernel.auth.adapter.constant;

/**
 * @author Ramadurai Saravana Pandian
 *
 */
public class AuthAdapterConstant {

	public static final String AUTH_COOOKIE_HEADER = "Authorization=";

	public static final String AUTH_REQUEST_COOOKIE_HEADER = "Authorization";

	public static final String AUTH_TOKEN_EXPIRED = "JWT expired";

	public static final String AUTH_TOKEN_EXPIRATION_MESSAGE = "Token expired";

	public static final String AUTH_SIGNATURE_TEXT = "JWT signature";

	public static final String AUTH_SIGNATURE_MESSAGE = "Security voilation JWT compromised signature failing";

	public static final String AUTH_INVALID_TOKEN = "Invalid Token";

	public static final String AUTH_HEADER_COOKIE = "Cookie";

	public static final String AUTH_HEADER_SET_COOKIE = "Set-Cookie";

	public static final String LOGGER_TARGET = "System.err";

	public static final int UNAUTHORIZED = 403;

	public static final int NOTAUTHENTICATED = 401;

	public static final int INTERNEL_SERVER_ERROR = 500;

}
