package constants;

/**
 *
 * @author MechAviv
 */
public enum ClientState {
    LOGIN_START_LOGO_STATE(0x00),
    LOGIN_DATA_LOADING_STATE(0x01),
    LOGIN_AFTER_LOADING(0x02),
    IN_GAME_FIELD(0x03),
    RE_LOGIN(0x04),
    EXIT_CLEAN_UP(0x05)// Disconnect
    ;
    int state;
    
    private ClientState(int state) {
        this.state = state;
    }
    
    public int getState() {
        return state;
    }
}
