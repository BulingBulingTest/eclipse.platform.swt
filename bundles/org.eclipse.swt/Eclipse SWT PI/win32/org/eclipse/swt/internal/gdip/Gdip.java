/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.gdip;

import org.eclipse.swt.internal.*;

/** @jniclass flags=cpp */
public class Gdip extends Platform {
	static {
		Library.loadLibrary ("swt-gdip"); //$NON-NLS-1$
	}

	/** GdiPlus constants */
	public static final float FlatnessDefault = 0.25f;
	public static final int BrushTypeSolidColor = 0;
	public static final int BrushTypeHatchFill = 1;
	public static final int BrushTypeTextureFill = 2;
	public static final int BrushTypePathGradient = 3;
	public static final int BrushTypeLinearGradient = 4;
	public static final int ColorAdjustTypeBitmap = 1;
	public static final int ColorMatrixFlagsDefault = 0;
	public static final int CombineModeReplace = 0;
	public static final int CombineModeIntersect = 1;
	public static final int CombineModeUnion = 2;
	public static final int CombineModeXor = 3;
	public static final int CombineModeExclude = 4;
	public static final int CombineModeComplement = 5;
	public static final int FillModeAlternate = 0;
	public static final int FillModeWinding = 1;
	public static final int DashCapFlat = 0;
	public static final int DashCapRound = 2;
	public static final int DashCapTriangle = 3;
	public static final int DashStyleSolid = 0;
	public static final int DashStyleDash = 1;
	public static final int DashStyleDot = 2;
	public static final int DashStyleDashDot = 3;
	public static final int DashStyleDashDotDot = 4;
	public static final int DashStyleCustom = 5;
	public static final int DriverStringOptionsRealizedAdvance = 4;
	public static final int FontStyleRegular = 0;
	public static final int FontStyleBold = 1;
	public static final int FontStyleItalic = 2;
	public static final int FontStyleBoldItalic = 3;
	public static final int FontStyleUnderline = 4;
	public static final int FontStyleStrikeout = 8;
	public static final int PaletteFlagsHasAlpha = 0x0001;
	public static final int FlushIntentionFlush = 0;
	public static final int FlushIntentionSync = 1;
	public static final int HotkeyPrefixNone = 0;
	public static final int HotkeyPrefixShow = 1;
	public static final int HotkeyPrefixHide = 2;
	public static final int LineJoinMiter = 0;
	public static final int LineJoinBevel = 1;
	public static final int LineJoinRound = 2;
	public static final int LineCapFlat = 0;
	public static final int LineCapSquare = 1;
	public static final int LineCapRound = 2;
	public static final int MatrixOrderPrepend = 0;
	public static final int MatrixOrderAppend = 1;
	public static final int QualityModeDefault = 0;
	public static final int QualityModeLow = 1;
	public static final int QualityModeHigh = 2;
	public static final int InterpolationModeDefault = QualityModeDefault;
	public static final int InterpolationModeLowQuality = QualityModeLow;
	public static final int InterpolationModeHighQuality = QualityModeHigh;
	public static final int InterpolationModeBilinear = QualityModeHigh + 1;
	public static final int InterpolationModeBicubic = QualityModeHigh + 2;
	public static final int InterpolationModeNearestNeighbor = QualityModeHigh + 3;
	public static final int InterpolationModeHighQualityBilinear = QualityModeHigh + 4;
	public static final int InterpolationModeHighQualityBicubic = QualityModeHigh + 5;
	public static final int PathPointTypeStart = 0;
	public static final int PathPointTypeLine = 1;
	public static final int PathPointTypeBezier = 3;
	public static final int PathPointTypePathTypeMask = 0x7;
	public static final int PathPointTypePathDashMode = 0x10;
	public static final int PathPointTypePathMarker = 0x20;
	public static final int PathPointTypeCloseSubpath = 0x80;
	public static final int PathPointTypeBezier3 = 3;
	public static final int PixelFormatIndexed = 0x00010000;
	public static final int PixelFormatGDI = 0x00020000;
	public static final int PixelFormatAlpha = 0x00040000;
	public static final int PixelFormatPAlpha = 0x00080000;
	public static final int PixelFormatExtended = 0x00100000;
	public static final int PixelFormatCanonical = 0x00200000;
	public static final int PixelFormat1bppIndexed = (1 | ( 1 << 8) | PixelFormatIndexed | PixelFormatGDI);
	public static final int PixelFormat4bppIndexed = (2 | ( 4 << 8) | PixelFormatIndexed | PixelFormatGDI);
	public static final int PixelFormat8bppIndexed = (3 | ( 8 << 8) | PixelFormatIndexed | PixelFormatGDI);
	public static final int PixelFormat16bppGrayScale = (4 | (16 << 8) | PixelFormatExtended);
	public static final int PixelFormat16bppRGB555 = (5 | (16 << 8) | PixelFormatGDI);
	public static final int PixelFormat16bppRGB565 = (6 | (16 << 8) | PixelFormatGDI);
	public static final int PixelFormat16bppARGB1555 = (7 | (16 << 8) | PixelFormatAlpha | PixelFormatGDI);
	public static final int PixelFormat24bppRGB = (8 | (24 << 8) | PixelFormatGDI);
	public static final int PixelFormat32bppRGB = (9 | (32 << 8) | PixelFormatGDI);
	public static final int PixelFormat32bppARGB = (10 | (32 << 8) | PixelFormatAlpha | PixelFormatGDI | PixelFormatCanonical);
	public static final int PixelFormat32bppPARGB = (11 | (32 << 8) | PixelFormatAlpha | PixelFormatPAlpha | PixelFormatGDI);
	public static final int PixelFormat48bppRGB = (12 | (48 << 8) | PixelFormatExtended);
	public static final int PixelFormat64bppARGB = (13 | (64 << 8) | PixelFormatAlpha  | PixelFormatCanonical | PixelFormatExtended);
	public static final int PixelFormat64bppPARGB = (14 | (64 << 8) | PixelFormatAlpha  | PixelFormatPAlpha | PixelFormatExtended);
	public static final int PixelFormat32bppCMYK = (15 | (32 << 8));
	public static final int PixelFormatMax = 16;
	public static final int PixelOffsetModeNone = QualityModeHigh + 1;
	public static final int PixelOffsetModeHalf = QualityModeHigh + 2;
	public static final int SmoothingModeDefault = QualityModeDefault;
	public static final int SmoothingModeHighSpeed = QualityModeLow;
	public static final int SmoothingModeHighQuality = QualityModeHigh;
	public static final int SmoothingModeNone = 3;
	public static final int SmoothingModeAntiAlias8x4 = 4;
	public static final int SmoothingModeAntiAlias = SmoothingModeAntiAlias8x4;
	public static final int SmoothingModeAntiAlias8x8 = 5;
	public static final int StringFormatFlagsDirectionRightToLeft = 0x00000001;
	public static final int StringFormatFlagsDirectionVertical = 0x00000002;
	public static final int StringFormatFlagsNoFitBlackBox = 0x00000004;
	public static final int StringFormatFlagsDisplayFormatControl = 0x00000020;
	public static final int StringFormatFlagsNoFontFallback = 0x00000400;
	public static final int StringFormatFlagsMeasureTrailingSpaces = 0x00000800;
	public static final int StringFormatFlagsNoWrap = 0x00001000;
	public static final int StringFormatFlagsLineLimit = 0x00002000;
	public static final int StringFormatFlagsNoClip = 0x00004000;
	public static final int TextRenderingHintSystemDefault = 0;
	public static final int TextRenderingHintSingleBitPerPixelGridFit = 1;
	public static final int TextRenderingHintSingleBitPerPixel = 2;
	public static final int TextRenderingHintAntiAliasGridFit = 3;
	public static final int TextRenderingHintAntiAlias = 4;
	public static final int TextRenderingHintClearTypeGridFit = 5;
	public static final int UnitPixel = 2;
	public static final int WrapModeTile = 0;
	public static final int WrapModeTileFlipX = 1;
	public static final int WrapModeTileFlipY = 2;
	public static final int WrapModeTileFlipXY = 3;
	public static final int WrapModeClamp = 4;

/** 64 bit */
public static final native int ColorPalette_sizeof();
public static final native int GdiplusStartupInput_sizeof();

/** GdiPlus natives */

/**
 * @param token cast=(ULONG_PTR *)
 * @param input cast=(const GdiplusStartupInput *)
 * @param output cast=(GdiplusStartupOutput *)
 */
public static final native int GdiplusStartup(long /*int*/[] token, GdiplusStartupInput input, long /*int*/ output);
/** @param token cast=(ULONG_PTR) */
public static final native void GdiplusShutdown(long /*int*/ token);
/**
 * @method flags=new
 * @param hbm cast=(HBITMAP)
 * @param hpal cast=(HPALETTE)
 */
public static final native long /*int*/ Bitmap_new(long /*int*/ hbm, long /*int*/ hpal);
/**
 * @method flags=new
 * @param hicon cast=(HICON)
 */
public static final native long /*int*/ Bitmap_new(long /*int*/ hicon);
/**
 * @method flags=new
 * @param format cast=(PixelFormat)
 * @param scan0 cast=(BYTE *)
 */
public static final native long /*int*/ Bitmap_new(int width, int height, int stride, int format, long /*int*/ scan0);
/**
 * @method flags=new
 * @param filename cast=(WCHAR*)
 */
public static final native long /*int*/ Bitmap_new(char[] filename, boolean useIcm);
/** @method flags=delete */
public static final native void Bitmap_delete(long /*int*/ bitmap);
/**
 * @method flags=cpp
 * @param bitmap cast=(Bitmap*)
 * @param colorBackground cast=(Color)
 * @param hbmReturn cast=(HBITMAP*)
 */
public static final native int Bitmap_GetHBITMAP(long /*int*/ bitmap, int colorBackground, long /*int*/[] hbmReturn);
/**
 * @method flags=cpp
 * @param bitmap cast=(Bitmap*)
 * @param hicon cast=(HICON*)
 */
public static final native int Bitmap_GetHICON(long /*int*/ bitmap, long /*int*/[] hicon);
/** @method flags=new */
public static final native long /*int*/ BitmapData_new();
/** @method flags=delete */
public static final native void BitmapData_delete(long /*int*/ bitmapData);
/**
 * @method flags=cpp
 * @param bitmap cast=(Bitmap*)
 * @param rect cast=(Rect*)
 * @param pixelFormat cast=(PixelFormat)
 * @param lockedBitmapData cast=(BitmapData*)
 */
public static final native int Bitmap_LockBits(long /*int*/ bitmap, long /*int*/ rect, int flags, int pixelFormat, long /*int*/ lockedBitmapData);
/**
 * @method flags=cpp
 * @param bitmap cast=(Bitmap*)
 * @param lockedBitmapData cast=(BitmapData*)
 */
public static final native int Bitmap_UnlockBits(long /*int*/ bitmap, long /*int*/ lockedBitmapData);
/**
 * @method flags=cpp
 * @param brush cast=(Brush *)
 */
public static final native long /*int*/ Brush_Clone(long /*int*/ brush);
/**
 * @method flags=cpp
 * @param brush cast=(Brush *)
 */
public static final native int Brush_GetType(long /*int*/ brush);
/** @method flags=new */
public static final native long /*int*/ PrivateFontCollection_new();
/** @method flags=delete */
public static final native void PrivateFontCollection_delete(long /*int*/ collection);
/**
 * @method flags=cpp
 * @param collection cast=(PrivateFontCollection *)
 * @param filename cast=(const WCHAR *)
 */
public static final native int PrivateFontCollection_AddFontFile(long /*int*/ collection, char[] filename);
/**
 * @method flags=new
 * @param hdc cast=(HDC)
 * @param hfont cast=(HFONT)
 */
public static final native long /*int*/ Font_new(long /*int*/ hdc, long /*int*/ hfont);
/**
 * @method flags=new
 * @param family cast=(const FontFamily *)
 * @param emSize cast=(REAL)
 * @param style cast=(INT)
 * @param unit cast=(Unit)
 */
public static final native long /*int*/ Font_new(long /*int*/ family, float emSize, int style, int unit);
/**
 * @method flags=new
 * @param familyName cast=(const WCHAR *)
 * @param emSize cast=(REAL)
 * @param style cast=(INT)
 * @param unit cast=(Unit)
 * @param fontCollection cast=(const FontCollection *)
 */
public static final native long /*int*/ Font_new(char[] familyName, float emSize, int style, int unit, long /*int*/ fontCollection);
/** @method flags=delete */
public static final native void Font_delete(long /*int*/ font);
/**
 * @method flags=cpp
 * @param font cast=(Font *)
 * @param family cast=(FontFamily *)
 */
public static final native int Font_GetFamily(long /*int*/ font, long /*int*/ family);
/**
 * @method flags=cpp
 * @param font cast=(Font *)
 */
public static final native float Font_GetSize(long /*int*/ font);
/**
 * @method flags=cpp
 * @param font cast=(Font *)
 */
public static final native int Font_GetStyle(long /*int*/ font);
/**
 * @method flags=cpp
 * @param font cast=(Font *)
 * @param g cast=(const Graphics *)
 * @param logfontW cast=(LOGFONTW *)
 */
public static final native int Font_GetLogFontW (long /*int*/ font, long /*int*/ g, long /*int*/  logfontW);
/**
 * @method flags=cpp
 * @param font cast=(Font *)
 */
public static final native boolean Font_IsAvailable(long /*int*/ font);
/** @method flags=new */
public static final native long /*int*/ FontFamily_new();
/**
 * @method flags=new
 * @param name cast=(const WCHAR *)
 * @param fontCollection cast=(const FontCollection *)
 */
public static final native long /*int*/ FontFamily_new(char[] name, long /*int*/ fontCollection);
/** @method flags=delete */
public static final native void FontFamily_delete(long /*int*/ family);
/**
 * @method flags=cpp
 * @param family cast=(FontFamily *)
 * @param name cast=(WCHAR *)
 * @param language cast=(WCHAR)
 */
public static final native int FontFamily_GetFamilyName(long /*int*/ family, char[] name, char language);
/**
 * @method flags=cpp
 * @param family cast=(FontFamily *)
 */
public static final native boolean FontFamily_IsAvailable(long /*int*/ family);
/**
 * @method flags=new
 * @param hdc cast=(HDC)
 */
public static final native long /*int*/ Graphics_new(long /*int*/ hdc);
/** @method flags=delete */
public static final native void Graphics_delete(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 */
public static final native int Graphics_DrawArc(long /*int*/ graphics, long /*int*/ pen, int x, int y, int width, int height, float startAngle, float sweepAngle);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param text cast=(const UINT16 *)
 * @param font cast=(const Font *)
 * @param brush cast=(const Brush *)
 * @param positions cast=(const PointF *)
 * @param matrix cast=(const Matrix *)
 */
public static final native int Graphics_DrawDriverString(long /*int*/ graphics, long /*int*/ text, int length, long /*int*/ font, long /*int*/ brush, PointF /*long*/ positions, int flags, long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param text cast=(const UINT16 *)
 * @param font cast=(const Font *)
 * @param brush cast=(const Brush *)
 * @param positions cast=(const PointF *),flags=no_out
 * @param matrix cast=(const Matrix *)
 */
public static final native int Graphics_DrawDriverString(long /*int*/ graphics, long /*int*/ text, int length, long /*int*/ font, long /*int*/ brush, float[] positions, int flags, long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 */
public static final native int Graphics_DrawEllipse(long /*int*/ graphics, long /*int*/ pen, int x, int y, int width, int height);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param image cast=(Image *)
 * @param x cast=(INT)
 * @param y cast=(INT)
 */
public static final native int Graphics_DrawImage(long /*int*/ graphics, long /*int*/ image, int x, int y);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param image cast=(Image *)
 * @param destRect cast=(const Rect *),flags=struct
 * @param srcx cast=(INT)
 * @param srcy cast=(INT)
 * @param srcwidth cast=(INT)
 * @param srcheight cast=(INT)
 * @param srcUnit cast=(Unit)
 * @param imageAttributes cast=(ImageAttributes *)
 * @param callback cast=(DrawImageAbort)
 * @param callbackData cast=(VOID *)
 */
public static final native int Graphics_DrawImage(long /*int*/ graphics, long /*int*/ image, Rect destRect, int srcx, int srcy, int srcwidth, int srcheight, int srcUnit, long /*int*/ imageAttributes, long /*int*/ callback, long /*int*/ callbackData);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 */
public static final native int Graphics_DrawLine(long /*int*/ graphics, long /*int*/ pen, int x1, int y1, int x2, int y2);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 * @param points cast=(const Point *),flags=no_out
 * @param count cast=(INT)
 */
public static final native int Graphics_DrawLines(long /*int*/ graphics, long /*int*/ pen, int[] points, int count);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 * @param path cast=(GraphicsPath *)
 */
public static final native int Graphics_DrawPath(long /*int*/ graphics, long /*int*/ pen, long /*int*/ path);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 * @param points cast=(Point *)
 * @param count cast=(INT)
 */
public static final native int Graphics_DrawPolygon(long /*int*/ graphics, long /*int*/ pen, int[] points, int count);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pen cast=(Pen *)
 */
public static final native int Graphics_DrawRectangle(long /*int*/ graphics, long /*int*/ pen, int x, int y, int width, int height);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param string cast=(WCHAR *)
 * @param length cast=(int)
 * @param font cast=(Font *)
 * @param origin flags=struct
 * @param brush cast=(Brush *)
 */
public static final native int Graphics_DrawString(long /*int*/ graphics, char[] string, int length, long /*int*/ font, PointF origin, long /*int*/ brush);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param string cast=(WCHAR *)
 * @param length cast=(int)
 * @param font cast=(Font *)
 * @param origin flags=struct
 * @param format cast=(StringFormat *)
 * @param brush cast=(Brush *)
 */
public static final native int Graphics_DrawString(long /*int*/ graphics, char[] string, int length, long /*int*/ font, PointF origin, long /*int*/ format, long /*int*/ brush);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param brush cast=(Brush *)
 * @param x cast=(INT)
 * @param y cast=(INT)
 * @param width cast=(INT)
 * @param height cast=(INT)
 */
public static final native int Graphics_FillEllipse(long /*int*/ graphics, long /*int*/ brush, int x, int y, int width, int height);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param brush cast=(Brush *)
 * @param path cast=(GraphicsPath *)
 */
public static final native int Graphics_FillPath(long /*int*/ graphics, long /*int*/ brush, long /*int*/ path);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param intention cast=(FlushIntention)
 */
public static final native void Graphics_Flush(long /*int*/ graphics, int intention);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param brush cast=(Brush *)
 * @param x cast=(INT)
 * @param y cast=(INT)
 * @param width cast=(INT)
 * @param height cast=(INT)
 * @param startAngle cast=(REAL)
 * @param sweepAngle cast=(REAL)
 */
public static final native int Graphics_FillPie(long /*int*/ graphics, long /*int*/ brush, int x, int y, int width, int height, float startAngle, float sweepAngle);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param brush cast=(Brush *)
 * @param points cast=(const Point *),flags=no_out
 * @param count cast=(INT)
 * @param fillMode cast=(FillMode)
 */
public static final native int Graphics_FillPolygon(long /*int*/ graphics, long /*int*/ brush, int[] points, int count, int fillMode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param brush cast=(Brush *)
 * @param x cast=(INT)
 * @param y cast=(INT)
 * @param width cast=(INT)
 * @param height cast=(INT)
 */
public static final native int Graphics_FillRectangle(long /*int*/ graphics, long /*int*/ brush, int x, int y, int width, int height);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_GetClipBounds(long /*int*/ graphics, RectF rect);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_GetClipBounds(long /*int*/ graphics, Rect rect);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param region cast=(Region *)
 */
public static final native int Graphics_GetClip(long /*int*/ graphics, long /*int*/ region);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native long /*int*/ Graphics_GetHDC(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param hdc cast=(HDC)
 */
public static final native void Graphics_ReleaseHDC(long /*int*/ graphics, long /*int*/ hdc);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_GetInterpolationMode(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_GetSmoothingMode(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_GetTextRenderingHint(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param matrix cast=(Matrix *)
 */
public static final native int Graphics_GetTransform(long /*int*/ graphics, long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_GetVisibleClipBounds(long /*int*/ graphics, Rect rect);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param text cast=(const UINT16 *)
 * @param font cast=(Font *)
 * @param positions cast=(const PointF *),flags=no_out
 * @param matrix cast=(const Matrix *)
 */
public static final native int Graphics_MeasureDriverString(long /*int*/ graphics, long /*int*/ text, int length, long /*int*/ font, float[] positions, int flags, long /*int*/ matrix, RectF boundingBox);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param string cast=(const WCHAR *)
 * @param length cast=(INT)
 * @param font cast=(const Font *)
 * @param origin cast=(const PointF *),flags=struct
 * @param boundingBox cast=(RectF *)
 */
public static final native int Graphics_MeasureString(long /*int*/ graphics, char[] string, int length, long /*int*/ font, PointF origin, RectF boundingBox);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param string cast=(const WCHAR *)
 * @param length cast=(INT)
 * @param font cast=(const Font *)
 * @param origin cast=(const PointF *),flags=struct
 * @param format cast=(StringFormat *)
 */
public static final native int Graphics_MeasureString(long /*int*/ graphics, char[] string, int length, long /*int*/ font, PointF origin, long /*int*/ format, RectF boundingBox);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_ResetClip(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param gstate cast=(GraphicsState)
 */
public static final native int Graphics_Restore(long /*int*/ graphics, int gstate);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 */
public static final native int Graphics_Save(long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param order cast=(MatrixOrder)
 */
public static final native int Graphics_ScaleTransform(long /*int*/ graphics, float sx, float sy, int order);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param hrgn cast=(Region *)
 * @param combineMode cast=(CombineMode)
 */
public static final native int Graphics_SetClip(long /*int*/ graphics, long /*int*/ hrgn, int combineMode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param rect cast=(Rect *),flags=struct
 * @param combineMode cast=(CombineMode)
 */
public static final native int Graphics_SetClip(long /*int*/ graphics, Rect rect, int combineMode);
/**
 * @method accessor=SetClip,flags=cpp
 * @param graphics cast=(Graphics *)
 * @param path cast=(GraphicsPath *)
 */
public static final native int Graphics_SetClipPath(long /*int*/ graphics, long /*int*/ path);
/**
 * @method accessor=SetClip,flags=cpp
 * @param graphics cast=(Graphics *)
 * @param path cast=(GraphicsPath *)
 * @param combineMode cast=(CombineMode)
 */
public static final native int Graphics_SetClipPath(long /*int*/ graphics, long /*int*/ path, int combineMode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param compositingQuality cast=(CompositingQuality)
 */
public static final native int Graphics_SetCompositingQuality(long /*int*/ graphics, int compositingQuality);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param unit cast=(Unit)
 */
public static final native int Graphics_SetPageUnit(long /*int*/ graphics, int unit);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param pixelOffsetMode cast=(PixelOffsetMode)
 */
public static final native int Graphics_SetPixelOffsetMode(long /*int*/ graphics, int pixelOffsetMode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param smoothingMode cast=(SmoothingMode)
 */
public static final native int Graphics_SetSmoothingMode(long /*int*/ graphics, int smoothingMode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param matrix cast=(Matrix *)
 */
public static final native int Graphics_SetTransform(long /*int*/ graphics, long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param mode cast=(InterpolationMode)
 */
public static final native int Graphics_SetInterpolationMode(long /*int*/ graphics, int mode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param mode cast=(TextRenderingHint)
 */
public static final native int Graphics_SetTextRenderingHint(long /*int*/ graphics, int mode);
/**
 * @method flags=cpp
 * @param graphics cast=(Graphics *)
 * @param order cast=(MatrixOrder)
 */
public static final native int Graphics_TranslateTransform(long /*int*/ graphics, float dx, float dy, int order);
/**
 * @method flags=new
 * @param fillMode cast=(FillMode)
 */
public static final native long /*int*/ GraphicsPath_new(int fillMode);
/**
 * @method flags=new
 * @param points cast=(const Point *),flags=no_out
 * @param types cast=(const BYTE *),flags=no_out
 * @param fillMode cast=(FillMode)
 */
public static final native long /*int*/ GraphicsPath_new(int[] points, byte[] types, int count, int fillMode);
/** @method flags=delete */
public static final native void GraphicsPath_delete(long /*int*/ path);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param x cast=(REAL)
 * @param y cast=(REAL)
 * @param width cast=(REAL)
 * @param height cast=(REAL)
 * @param startAngle cast=(REAL)
 * @param sweepAngle cast=(REAL)
 */
public static final native int GraphicsPath_AddArc(long /*int*/ path, float x, float y, float width, float height, float startAngle, float sweepAngle);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param x1 cast=(REAL)
 * @param y1 cast=(REAL)
 * @param x2 cast=(REAL)
 * @param y2 cast=(REAL)
 * @param x3 cast=(REAL)
 * @param y3 cast=(REAL)
 * @param x4 cast=(REAL)
 * @param y4 cast=(REAL)
 */
public static final native int GraphicsPath_AddBezier(long /*int*/ path, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param x1 cast=(REAL)
 * @param y1 cast=(REAL)
 * @param x2 cast=(REAL)
 * @param y2 cast=(REAL)
 */
public static final native int GraphicsPath_AddLine(long /*int*/ path, float x1, float y1, float x2, float y2);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param addingPath cast=(GraphicsPath *)
 * @param connect cast=(BOOL)
 */
public static final native int GraphicsPath_AddPath(long /*int*/ path, long /*int*/ addingPath, boolean connect);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param rect flags=struct
 */
public static final native int GraphicsPath_AddRectangle(long /*int*/ path, RectF rect);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param string cast=(const WCHAR *)
 * @param length cast=(INT)
 * @param family cast=(const FontFamily *)
 * @param style cast=(INT)
 * @param emSize cast=(REAL)
 * @param origin cast=(const PointF *),flags=struct
 * @param format cast=(const StringFormat *)
 */
public static final native int GraphicsPath_AddString(long /*int*/ path, char[] string, int length, long /*int*/ family, int style, float emSize, PointF origin, long /*int*/ format);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 */
public static final native int GraphicsPath_CloseFigure(long /*int*/ path);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 */
public static final native long /*int*/ GraphicsPath_Clone(long /*int*/ path);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param matrix cast=(Matrix *)
 */
public static final native int GraphicsPath_Flatten(long /*int*/ path, long /*int*/ matrix, float flatness);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param matrix cast=(Matrix *)
 * @param pen cast=(Pen *)
 */
public static final native int GraphicsPath_GetBounds(long /*int*/ path, RectF bounds, long /*int*/ matrix, long /*int*/ pen);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param lastPoint cast=(PointF *)
 */
public static final native int GraphicsPath_GetLastPoint(long /*int*/ path, PointF lastPoint);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param points cast=(PointF *)
 */
public static final native int GraphicsPath_GetPathPoints(long /*int*/ path, float[] points, int count);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param types cast=(BYTE *)
 */
public static final native int GraphicsPath_GetPathTypes(long /*int*/ path, byte[] types, int count);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 */
public static final native int GraphicsPath_GetPointCount(long /*int*/ path);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param pen cast=(const Pen *)
 * @param g cast=(const Graphics *)
 */
public static final native boolean GraphicsPath_IsOutlineVisible(long /*int*/ path, float x, float y, long /*int*/ pen, long /*int*/ g);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param g cast=(const Graphics *)
 */
public static final native boolean GraphicsPath_IsVisible(long /*int*/ path, float x, float y, long /*int*/ g);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param fillmode cast=(FillMode)
 */
public static final native int GraphicsPath_SetFillMode(long /*int*/ path, int fillmode);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 */
public static final native int GraphicsPath_StartFigure(long /*int*/ path);
/**
 * @method flags=cpp
 * @param path cast=(GraphicsPath *)
 * @param matrix cast=(Matrix *)
 */
public static final native int GraphicsPath_Transform(long /*int*/ path, long /*int*/ matrix);
/**
 * @method flags=new
 * @param hatchStyle cast=(HatchStyle)
 * @param foreColor cast=(Color)
 * @param backColor cast=(Color)
 */
public static final native long /*int*/ HatchBrush_new(int hatchStyle, int foreColor, int backColor);
/**
 * @method flags=cpp
 * @param image cast=(Image*)
 */
public static final native int Image_GetLastStatus(long /*int*/ image);
/**
 * @method flags=cpp
 * @param image cast=(Image*)
 */
public static final native int Image_GetPixelFormat(long /*int*/ image);
/**
 * @method flags=cpp
 * @param image cast=(Image *)
 */
public static final native int Image_GetWidth(long /*int*/ image);
/**
 * @method flags=cpp
 * @param image cast=(Image *)
 */
public static final native int Image_GetHeight(long /*int*/ image);
/**
 * @method flags=cpp
 * @param image cast=(Image*)
 * @param palette cast=(ColorPalette*)
 */
public static final native int Image_GetPalette(long /*int*/ image, long /*int*/ palette, int size);
/**
 * @method flags=cpp
 * @param image cast=(Image*)
 */
public static final native int Image_GetPaletteSize(long /*int*/ image);
/** @method flags=new */
public static final native long /*int*/ ImageAttributes_new();
/** @method flags=delete */
public static final native void ImageAttributes_delete(long /*int*/ attrib);
/**
 * @method flags=cpp
 * @param attrib cast=(ImageAttributes *)
 * @param wrap cast=(WrapMode)
 */
public static final native int ImageAttributes_SetWrapMode(long /*int*/ attrib, int wrap);
/**
 * @method flags=cpp
 * @param attrib cast=(ImageAttributes *)
 * @param matrix cast=(ColorMatrix *)
 * @param mode cast=(ColorMatrixFlags)
 * @param type cast=(ColorAdjustType)
 */
public static final native int ImageAttributes_SetColorMatrix(long /*int*/ attrib, float[] matrix, int mode, int type);
/** @method flags=delete */
public static final native void HatchBrush_delete(long /*int*/ brush);
/**
 * @method flags=new
 * @param point1 flags=struct
 * @param point2 flags=struct
 * @param color1 cast=(Color)
 * @param color2 cast=(Color)
 */
public static final native long /*int*/ LinearGradientBrush_new(PointF point1, PointF point2, int color1, int color2);
/** @method flags=delete */
public static final native void LinearGradientBrush_delete(long /*int*/ brush);
/**
 * @method flags=cpp
 * @param brush cast=(LinearGradientBrush *)
 * @param presetColors cast=(const Color *),flags=no_out
 * @param blendPositions cast=(const REAL *),flags=no_out
 */
public static final native int LinearGradientBrush_SetInterpolationColors(long /*int*/ brush, int [] presetColors, float[] blendPositions, int count);
/**
 * @method flags=cpp
 * @param brush cast=(LinearGradientBrush *)
 * @param wrapMode cast=(WrapMode)
 */
public static final native int LinearGradientBrush_SetWrapMode(long /*int*/ brush, int wrapMode);
/**
 * @method flags=cpp
 * @param brush cast=(LinearGradientBrush *)
 */
public static final native int LinearGradientBrush_ResetTransform(long /*int*/ brush);
/**
 * @method flags=cpp
 * @param brush cast=(LinearGradientBrush *)
 * @param order cast=(MatrixOrder)
 */
public static final native int LinearGradientBrush_ScaleTransform(long /*int*/ brush, float sx, float sy, int order);
/**
 * @method flags=cpp
 * @param brush cast=(LinearGradientBrush *)
 * @param order cast=(MatrixOrder)
 */
public static final native int LinearGradientBrush_TranslateTransform(long /*int*/ brush, float dx, float dy, int order);
/**
 * @method flags=new
 * @param m11 cast=(REAL)
 * @param m12 cast=(REAL)
 * @param m21 cast=(REAL)
 * @param m22 cast=(REAL)
 * @param dx cast=(REAL)
 * @param dy cast=(REAL)
 */
public static final native long /*int*/ Matrix_new(float m11, float m12, float m21, float m22, float dx, float dy);
/** @method flags=delete */
public static final native void Matrix_delete(long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param m cast=(REAL *)
 */
public static final native int Matrix_GetElements(long /*int*/ matrix, float[] m);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 */
public static final native int Matrix_Invert(long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 */
public static final native boolean Matrix_IsIdentity(long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param matrix1 cast=(Matrix *)
 * @param order cast=(MatrixOrder)
 */
public static final native int Matrix_Multiply(long /*int*/ matrix, long /*int*/ matrix1, int order);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param angle cast=(REAL)
 * @param order cast=(MatrixOrder)
 */
public static final native int Matrix_Rotate(long /*int*/ matrix, float angle, int order);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param scaleX cast=(REAL)
 * @param scaleY cast=(REAL)
 * @param order cast=(MatrixOrder)
 */
public static final native int Matrix_Scale(long /*int*/ matrix, float scaleX, float scaleY, int order);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param shearX cast=(REAL)
 * @param shearY cast=(REAL)
 * @param order cast=(MatrixOrder)
 */
public static final native int Matrix_Shear(long /*int*/ matrix, float shearX, float shearY, int order);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 */
public static final native int Matrix_TransformPoints(long /*int*/ matrix, PointF pts, int count);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param pts cast=(PointF *)
 */
public static final native int Matrix_TransformPoints(long /*int*/ matrix, float[] pts, int count);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 */
public static final native int Matrix_TransformVectors(long /*int*/ matrix, PointF pts, int count);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param offsetX cast=(REAL)
 * @param offsetY cast=(REAL)
 * @param order cast=(MatrixOrder)
 */
public static final native int Matrix_Translate(long /*int*/ matrix, float offsetX, float offsetY, int order);
/**
 * @method flags=cpp
 * @param matrix cast=(Matrix *)
 * @param m11 cast=(REAL)
 * @param m12 cast=(REAL)
 * @param m21 cast=(REAL)
 * @param m22 cast=(REAL)
 * @param dx cast=(REAL)
 * @param dy cast=(REAL)
 */
public static final native int Matrix_SetElements(long /*int*/ matrix, float m11, float m12, float m21, float m22, float dx, float dy);
/**
 * @param Destination cast=(PVOID)
 * @param SourcePtr cast=(CONST VOID*)
 */
public static final native void MoveMemory(ColorPalette Destination, long /*int*/ SourcePtr, int Length);
/**
 * @param Destination cast=(PVOID)
 * @param SourcePtr cast=(CONST VOID*)
 */
public static final native void MoveMemory(BitmapData Destination, long /*int*/ SourcePtr);
/**
 * @method flags=new
 * @param path cast=(GraphicsPath *)
 */
public static final native long /*int*/ PathGradientBrush_new(long /*int*/ path);
/** @method flags=delete */
public static final native void PathGradientBrush_delete(long /*int*/ brush);
/**
 * @method flags=cpp
 * @param brush cast=(PathGradientBrush *)
 * @param color cast=(Color)
 */
public static final native int PathGradientBrush_SetCenterColor(long /*int*/ brush, int color);
/**
 * @method flags=cpp
 * @param brush cast=(PathGradientBrush *)
 * @param pt flags=struct
 */
public static final native int PathGradientBrush_SetCenterPoint(long /*int*/ brush, PointF pt);
/**
 * @method flags=cpp
 * @param brush cast=(PathGradientBrush *)
 * @param presetColors cast=(const Color *),flags=no_out
 * @param blendPositions cast=(const REAL *),flags=no_out
 */
public static final native int PathGradientBrush_SetInterpolationColors(long /*int*/ brush, int [] presetColors, float[] blendPositions, int count);
/**
 * @method flags=cpp
 * @param brush cast=(PathGradientBrush *)
 * @param colors cast=(const Color *),flags=no_out
 * @param count cast=(INT *)
 */
public static final native int PathGradientBrush_SetSurroundColors(long /*int*/ brush, int [] colors, int[] count);
/**
 * @method flags=cpp
 * @param brush cast=(PathGradientBrush *)
 * @param path cast=(GraphicsPath *)
 */
public static final native int PathGradientBrush_SetGraphicsPath(long /*int*/ brush, long /*int*/ path);
/**
 * @method flags=cpp
 * @param brush cast=(PathGradientBrush *)
 * @param wrapMode cast=(WrapMode)
 */
public static final native int PathGradientBrush_SetWrapMode(long /*int*/ brush, int wrapMode);
/**
 * @method flags=new
 * @param brush cast=(Brush *)
 * @param width cast=(REAL)
 */
public static final native long /*int*/ Pen_new(long /*int*/ brush, float width);
/** @method flags=delete */
public static final native void Pen_delete(long /*int*/ pen);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 */
public static final native long /*int*/ Pen_GetBrush(long /*int*/ pen);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 * @param brush cast=(Brush *)
 */
public static final native int Pen_SetBrush(long /*int*/ pen, long /*int*/ brush);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 */
public static final native int Pen_SetDashOffset(long /*int*/ pen, float dashOffset);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 * @param dashArray cast=(REAL *)
 * @param count cast=(int)
 */
public static final native int Pen_SetDashPattern(long /*int*/ pen, float[] dashArray, int count);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 * @param dashStyle cast=(DashStyle)
 */
public static final native int Pen_SetDashStyle(long /*int*/ pen, int dashStyle);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 * @param startCap cast=(LineCap)
 * @param endCap cast=(LineCap)
 * @param dashCap cast=(DashCap)
 */
public static final native int Pen_SetLineCap(long /*int*/ pen, int startCap, int endCap, int dashCap);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 * @param lineJoin cast=(LineJoin)
 */
public static final native int Pen_SetLineJoin(long /*int*/ pen, int lineJoin);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 */
public static final native int Pen_SetMiterLimit(long /*int*/ pen, float miterLimit);
/**
 * @method flags=cpp
 * @param pen cast=(Pen *)
 * @param width cast=(REAL)
 */
public static final native int Pen_SetWidth(long /*int*/ pen, float width);
/** @method flags=new */
public static final native long /*int*/ Point_new(int x, int y);
/** @method flags=delete */
public static final native void Point_delete(long /*int*/ point);
/**
 * @method flags=new
 * @param hRgn cast=(HRGN)
 */
public static final native long /*int*/ Region_new(long /*int*/ hRgn);
/**
 * @method flags=new
 * @param path cast=(GraphicsPath*)
 */
public static final native long /*int*/ Region_newGraphicsPath(long /*int*/ path);
/** @method flags=new */
public static final native long /*int*/ Region_new();
/** @method flags=delete */
public static final native void Region_delete(long /*int*/ region);
/**
 * @method flags=cpp
 * @param region cast=(Region *)
 * @param graphics cast=(Graphics *)
 */
public static final native long /*int*/ Region_GetHRGN(long /*int*/ region, long /*int*/ graphics);
/**
 * @method flags=cpp
 * @param region cast=(Region *)
 * @param graphics cast=(Graphics *)
 */
public static final native boolean Region_IsInfinite(long /*int*/ region, long /*int*/ graphics);
/**
 * @method flags=new
 * @param color cast=(Color)
 */
public static final native long /*int*/ SolidBrush_new(int color);
/** @method flags=delete */
public static final native void SolidBrush_delete(long /*int*/ brush);
/** @method flags=delete */
public static final native void StringFormat_delete(long /*int*/ format);
/**
 * @method flags=cpp
 * @param format cast=(StringFormat *)
 */
public static final native long /*int*/ StringFormat_Clone(long /*int*/ format);
/** @method accessor=StringFormat::GenericDefault */
public static final native long /*int*/ StringFormat_GenericDefault();
/** @method accessor=StringFormat::GenericTypographic */
public static final native long /*int*/ StringFormat_GenericTypographic();
/**
 * @method flags=cpp
 * @param format cast=(StringFormat *)
 */
public static final native int StringFormat_GetFormatFlags(long /*int*/ format);
/**
 * @method flags=cpp
 * @param format cast=(StringFormat *)
 * @param hotkeyPrefix cast=(HotkeyPrefix)
 */
public static final native int StringFormat_SetHotkeyPrefix(long /*int*/ format, int hotkeyPrefix);
/**
 * @method flags=cpp
 * @param format cast=(StringFormat *)
 * @param flags cast=(StringFormatFlags)
 */
public static final native int StringFormat_SetFormatFlags(long /*int*/ format, int flags);
/**
 * @method flags=cpp
 * @param format cast=(StringFormat *)
 */
public static final native int StringFormat_SetTabStops(long /*int*/ format, float firstTabOffset, int count, float[] tabStops);
/**
 * @method flags=new
 * @param image cast=(Image *)
 * @param wrapMode cast=(WrapMode)
 */
public static final native long /*int*/ TextureBrush_new(long /*int*/ image, int wrapMode, float dstX, float dstY, float dstWidth, float dstHeight);
/** @method flags=delete */
public static final native void TextureBrush_delete(long /*int*/ brush);
/**
 * @method flags=cpp
 * @param brush cast=(TextureBrush *)
 * @param matrix cast=(Matrix *)
 */
public static final native int TextureBrush_SetTransform(long /*int*/ brush, long /*int*/ matrix);
/**
 * @method flags=cpp
 * @param brush cast=(TextureBrush *)
 */
public static final native int TextureBrush_ResetTransform(long /*int*/ brush);
/**
 * @method flags=cpp
 * @param brush cast=(TextureBrush *)
 * @param order cast=(MatrixOrder)
 */
public static final native int TextureBrush_ScaleTransform(long /*int*/ brush, float sx, float sy, int order);
/**
 * @method flags=cpp
 * @param brush cast=(TextureBrush *)
 * @param order cast=(MatrixOrder)
 */
public static final native int TextureBrush_TranslateTransform(long /*int*/ brush, float dx, float dy, int order);
}
