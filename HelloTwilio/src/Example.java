/**
 * Created by kirstenruge on 1/26/19.
 */

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;




    public class Example {
        // Find your Account Sid and Token at twilio.com/user/account
        public static final String ACCOUNT_SID = "ACfaac42048994c9996be0bac5ebea70c5";
        public static final String AUTH_TOKEN = "800183d18af574df943bdfcdfabdb84f";

        public static void main(String[] args) {
//           Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            String validatedto = "+15073512831";

            if(validatePhoneFormat(validatedto)){


            }
            else{
                System.out.println("phone number invalid");
                validatedto = "+15555555555";
            }
            PhoneNumber to = new PhoneNumber(validatedto);
            PhoneNumber from = new PhoneNumber("+15072257969");
            String body = "Rivers don't make me calm, they piss me off!";

            sendSMS(ACCOUNT_SID, AUTH_TOKEN, to, from, body );
        }

        public static void sendSMS(String ACCOUNT_SID, String AUTH_TOKEN, PhoneNumber to, PhoneNumber from, String body){
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(to, from, body).create();
            System.out.println("Message sent");

        }
        public static Boolean validatePhoneFormat(String phoneString){
            String pattern = "[+]\\d{11}";
            if(phoneString.matches(pattern)){
                return true;
            }else{
                return false;

            }

        }
    }

