package rql4j.domain;

import java.util.List;

/**
 * User: Burkhard Pauli | mail@bpauli.de
 * Date: 1/24/11
 * Time: 18:08 PM
 */
public class Links {
    private String action;
    private List<Link> linkList;

    public Links() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Link> getLinkList() {
        return linkList;
    }

    public void setLinkList(List<Link> linkList) {
        this.linkList = linkList;
    }

    @Override
    public String toString() {
        return "Links{" +
                "action='" + action + '\'' +
                ", linkList=" + linkList +
                '}';
    }
}
