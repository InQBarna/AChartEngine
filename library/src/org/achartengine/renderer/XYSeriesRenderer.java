/**
 * Copyright (C) 2009 - 2012 SC 4ViewSoft SRL
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.achartengine.renderer;

import org.achartengine.chart.PointStyle;

import android.graphics.Color;

/**
 * A renderer for the XY type series.
 */
public class XYSeriesRenderer extends SimpleSeriesRenderer {
  /** If the chart points should be filled. */
  private boolean mFillPoints = false;
  /** If the chart should be filled outside its line. */
  private FillOutsideLine mFillBelowLine = FillOutsideLine.NONE;
  /**
   * If gradient is false is the solid color to fill the outside of the line.
   * Otherwise It's the top color of the gradient to fill the outside of the
   * line.
   */
  private int mFillColor = Color.argb(125, 0, 0, 200);
  /** The bottom color of the gradient to fill the outside of the line. */
  private int mFillColorBottom = Color.argb(255, 0, 0, 255);
  /** If the outside of the line should be filled with a gradient or not. */
  private boolean gradient = false;
  /** The point style. */
  private PointStyle mPointStyle = PointStyle.POINT;
  /** The point stroke width */
  private float pointStrokeWidth = 1;
  /** The chart line width. */
  private float mLineWidth = 1;

  public enum FillOutsideLine {
    NONE, INTEGRAL, BELOW, ABOVE;
  }

  /**
   * Returns if the chart should be filled below the line.
   * 
   * @return the fill below line status
   * 
   * @deprecated Use {@link #getFillOutsideLine()} instead.
   */
  @Deprecated
  public boolean isFillBelowLine() {
    return mFillBelowLine != FillOutsideLine.NONE;
  }

  /**
   * Sets if the line chart should be filled below its line. Filling below the
   * line transforms a line chart into an area chart.
   * 
   * @param fill the fill below line flag value
   * 
   * @deprecated Use {@link #setFillOutsideLine(FillOutsideLine)} instead.
   */
  @Deprecated
  public void setFillBelowLine(boolean fill) {
    mFillBelowLine = fill ? FillOutsideLine.INTEGRAL : FillOutsideLine.NONE;
  }

  /**
   * Returns the type of the outside fill of the line.
   * 
   * @return the type of the outside fill of the line
   */
  public FillOutsideLine getFillOutsideLine() {
    return mFillBelowLine;
  }

  /**
   * Sets if the line chart should be filled outside its line. Filling outside
   * with FillOutsideLine.INTEGRAL the line transforms a line chart into an area
   * chart.
   * 
   * @param the type of the filling
   */
  public void setFillOutsideLine(FillOutsideLine fill) {
    mFillBelowLine = fill;
  }

  /**
   * Returns if the chart should be filled with a gradient
   * 
   * @return if the outside of the line should be filled with a gradient or not
   */
  public boolean isFillOutsideLineGradient() {
    return gradient;
  }

  /**
   * Sets if the line chart should be filled outside its line with a gradient.
   * 
   * @param if the outside of the line should be filled with a gradient or not
   */
  public void setFillOutsideLineGradient(boolean gradient) {
    this.gradient = gradient;
  }

  /**
   * Returns if the chart points should be filled.
   * 
   * @return the points fill status
   */
  public boolean isFillPoints() {
    return mFillPoints;
  }

  /**
   * Sets if the chart points should be filled.
   * 
   * @param fill the points fill flag value
   */
  public void setFillPoints(boolean fill) {
    mFillPoints = fill;
  }

  /**
   * Returns the fill below line color.
   * 
   * @return the fill below line color
   * 
   * @deprecated Use {@link #getFillOutsideLineColor()} instead.
   */
  @Deprecated
  public int getFillBelowLineColor() {
    return mFillColor;
  }

  /**
   * Sets the fill below the line color.
   * 
   * @param color the fill below line color
   * 
   * @deprecated Use {@link #setFillOutsideLineColor(int)} instead.
   */
  @Deprecated
  public void setFillBelowLineColor(int color) {
    mFillColor = color;
  }

  /**
   * If {@link #isFillOutsideLineGradient()} is false it's the solid color to
   * fill the outside of the line. Otherwise it's the top color of the gradient
   * to fill the outside of the line.
   * 
   * @return the color
   */
  public int getFillOutsideLineColor() {
    return mFillColor;
  }

  /**
   * If {@link #isFillOutsideLineGradient()} is false it sets the solid color to
   * fill the outside of the line. Otherwise it sets the top color of the
   * gradient to fill the outside of the line.
   * 
   * @param color the fill below line color
   */
  public void setFillOutsideLineColor(int color) {
    mFillColor = color;
  }

  /**
   * The bottom color of the gradient to fill the outside of the line.
   * 
   * @return the color
   */
  public int getFillOutsideLineColorBottom() {
    return mFillColorBottom;
  }

  /**
   * It sets the bottom color of the gradient to fill the outside of the line.
   * 
   * @param color the fill below line color
   */
  public void setFillOutsideLineColorBottom(int color) {
    mFillColorBottom = color;
  }

  /**
   * Returns the point style.
   * 
   * @return the point style
   */
  public PointStyle getPointStyle() {
    return mPointStyle;
  }

  /**
   * Sets the point style.
   * 
   * @param style the point style
   */
  public void setPointStyle(PointStyle style) {
    mPointStyle = style;
  }

  /**
   * Returns the point stroke width in pixels.
   * 
   * @return the point stroke width in pixels
   */
  public float getPointStrokeWidth() {
    return pointStrokeWidth;
  }

  /**
   * Sets the point stroke width in pixels.
   * 
   * @param strokeWidth the point stroke width in pixels
   */
  public void setPointStrokeWidth(float strokeWidth) {
    this.pointStrokeWidth = strokeWidth;
  }

  /**
   * Returns the chart line width.
   * 
   * @return the line width
   */
  public float getLineWidth() {
    return mLineWidth;
  }

  /**
   * Sets the chart line width.
   * 
   * @param lineWidth the line width
   */
  public void setLineWidth(float lineWidth) {
    mLineWidth = lineWidth;
  }

}
