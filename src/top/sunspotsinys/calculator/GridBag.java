package top.sunspotsinys.calculator;

import java.awt.*;

/**
 * @author SunspotsInys
 * @date 2019/5/16
 */
public class GridBag extends GridBagConstraints {

    public GridBag(int gridx, int gridy) {
        this.gridx = gridx;
        this.gridy = gridy;
    }

    public GridBag(int gridx, int gridy, int gridwidth, int gridheight) {
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
    }

    public GridBag setAnchor(int anchor) {
        this.anchor = anchor;
        return this;
    }

    public GridBag setFill(int fill) {
        this.fill = fill;
        return this;
    }

    public GridBag setWeight(double weightx, double weighty) {
        this.weightx = weightx;
        this.weighty = weighty;
        return this;
    }

    public GridBag setInsets(int distance) {
        this.insets = new Insets(distance, distance, distance, distance);
        return this;
    }

    public GridBag setInsets(int top, int left, int bottom, int right) {
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }

    public GridBag setIpad(int ipadx, int ipady) {
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }

}
