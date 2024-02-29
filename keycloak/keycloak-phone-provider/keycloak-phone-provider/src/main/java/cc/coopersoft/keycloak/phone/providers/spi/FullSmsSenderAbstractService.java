package cc.coopersoft.keycloak.phone.providers.spi;

import cc.coopersoft.keycloak.phone.providers.constants.TokenCodeType;
import cc.coopersoft.keycloak.phone.providers.exception.MessageSendException;

import java.io.IOException;

import cc.coopersoft.keycloak.phone.providers.sender.services.RestClient;

public abstract class FullSmsSenderAbstractService implements MessageSenderService {

    private final String realmDisplay;

    public FullSmsSenderAbstractService(String realmDisplay) {
        this.realmDisplay = realmDisplay;
    }

    public abstract void sendMessage(String phoneNumber, String message) throws MessageSendException;

    @Override
    public void sendSmsMessage(TokenCodeType type, String phoneNumber, String code, int expires, String kind) throws MessageSendException {

        // final vars
        final String username = "09163109093";
        final String password = "MGYT7";
        final int bodyId = 136982;

        //make rest connection to Melipayamak
//        RestClient restClient = new RestClient(username, password);
//        try {
//            // sending sms
//            restClient.SendByBaseNumber(code, phoneNumber, bodyId);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //TODO template from keycloak message bundle
        final String MESSAGE = String.format("[%s] - " + type.label + " code: %s, expires: %s minute ", realmDisplay, code, expires / 60);
        sendMessage(phoneNumber, MESSAGE);
    }
}
