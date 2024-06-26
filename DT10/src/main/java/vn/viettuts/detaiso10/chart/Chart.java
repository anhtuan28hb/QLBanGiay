package vn.viettuts.detaiso10.chart;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import vn.viettuts.detaiso10.barchart.BlankPlotChart;
import vn.viettuts.detaiso10.barchart.BlankPlotChatRender;
import vn.viettuts.detaiso10.barchart.SeriesSize;

public class Chart extends javax.swing.JPanel {
    private final int seriesSize=10;
    private final int seriesSpace=5;
    private List<ModelLegend> legends =new ArrayList<>();
    private List<ModelChart> model= new ArrayList<>();
    private final Animator animator;
    private float animate;
    public Chart() {
        initComponents();
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                animate = fraction;
                repaint();
            }
        };
        animator= new Animator(800,target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        blankPlotChart.setBlankPlotChatRender(new BlankPlotChatRender(){
            @Override
            public String getLabelText(int index){
                return model.get(index).getLabel();
            }
            @Override
            public void renderSeries(BlankPlotChart chart, Graphics2D g2, SeriesSize size, int index) {
                double totalSeriesWidth = (seriesSize * legends.size()) + (seriesSpace * (legends.size() - 1));
                double x = (size.getWidth() - totalSeriesWidth) / 2;
                for (int i = 0; i < legends.size(); i++) {
                    if (i < model.get(index).getValues().length && i < legends.size()) { // Kiểm tra kích thước của mảng trước khi truy cập
                        ModelLegend legend = legends.get(i);
                        g2.setColor(legend.getColor());
                        double seriesValue = chart.getSeriesValuesOf(model.get(index).getValues()[i], size.getHeight()*animate);
                        g2.fillRect((int)(size.getX() + x), (int)(size.getY() + size.getHeight() - seriesValue), seriesSize, (int)seriesValue);
                    }
                    x += seriesSpace + seriesSize;
                }
            }
        });
    }
    
    public void addLegend(String name, Color color){
        ModelLegend data= new ModelLegend(name,color);
        legends.add(data);
        panelLegend.add(new LegendItem(data));
        panelLegend.repaint();
        panelLegend.revalidate();
    }
    public void addData(ModelChart data){
        model.add(data);
        blankPlotChart.setLabelCount(model.size());
        double max= data.getMaxValues();
        if(max>blankPlotChart.getMaxValues()){
            blankPlotChart.setMaxValues(max);
        }
    }
    public void start() {
        if (!animator.isRunning()) {
            animator.start();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blankPlotChart = new vn.viettuts.detaiso10.barchart.BlankPlotChart();
        panelLegend = new javax.swing.JPanel();

        panelLegend.setOpaque(false);
        panelLegend.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blankPlotChart, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(panelLegend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(blankPlotChart, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelLegend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vn.viettuts.detaiso10.barchart.BlankPlotChart blankPlotChart;
    private javax.swing.JPanel panelLegend;
    // End of variables declaration//GEN-END:variables
}
