package us.kpatrick.enums;

/**
 * ENUM OF TEAM AND MASCOT
 * @author kpatr
 * @version 1.0.0
 */
public enum NFCMascot {
    DAL("Dallas Cowboys"),
    COW("Dallas Cowboys"),
    WAS("Washington Redskins"),
    RED("Washington Redskins"),
    PHI("Philadelphia Eagles"),
    EAG("Philadelphia Eagles"),
    NEW("New York Giants"),
    GIA("New York Giants"),
    LOS("Los Angeles Rams"),
    RAM("Los Angeles Rams"),
    SAN("San Francisco 49ers"),
    FOR("San Francisco 49ers"),
    SEA("Seattle Seahawks"),
    AIR("Arizona Cardinals"),
    CAR("Arizona Cardinals"),
    GRE("Green Bay Packers"),
    PAC("Green Bay Packers"),
    MIN("Minnesota Vikings"),
    VIK("Minnesota Vikings"),
    CHI("Chicago Bears"),
    BEA("Chicago Bears"),
    DET("Detroit Lions"),
    LIO("Detroit Lions"),
    TAM("Tampa Bay Buccaneers"),
    BUC("Tampa Bay Buccaneers"),
    ATL("Atlanta Falcons"),
    FAL("Atlanta Falcons"),
    PAN("Carolina Panthers"),
    ORL("New Orleans Saints"),
    SAI("New Orleans Saints")
    ;

    private String team;

    /**
     * constructor of the program
     * @param team team name to use
     */
    NFCMascot(String team) {
        this.team = team;
    }

    /**
     * get the team name
     * @return string of the team name
     */
    public String getTeam() {
        return team;
    }
}
