package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.BooleanCesiumWriter;
import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.MaterialCesiumWriter;
import cesiumlanguagewriter.PositionListCesiumWriter;
import java.awt.Color;
import java.util.List;

/**
 *  
 Writes a <code>Polygon</code> to a  {@link CesiumOutputStream}.  A <code>Polygon</code> is a polygon, which is a closed figure on the surface of the Earth.
 

 */
public class PolygonCesiumWriter extends CesiumPropertyWriter<PolygonCesiumWriter> {
	/**
	 *  
	The name of the <code>show</code> property.
	

	 */
	public static final String ShowPropertyName = "show";
	/**
	 *  
	The name of the <code>positions</code> property.
	

	 */
	public static final String PositionsPropertyName = "positions";
	/**
	 *  
	The name of the <code>height</code> property.
	

	 */
	public static final String HeightPropertyName = "height";
	/**
	 *  
	The name of the <code>extrudedHeight</code> property.
	

	 */
	public static final String ExtrudedHeightPropertyName = "extrudedHeight";
	/**
	 *  
	The name of the <code>stRotation</code> property.
	

	 */
	public static final String StRotationPropertyName = "stRotation";
	/**
	 *  
	The name of the <code>granularity</code> property.
	

	 */
	public static final String GranularityPropertyName = "granularity";
	/**
	 *  
	The name of the <code>fill</code> property.
	

	 */
	public static final String FillPropertyName = "fill";
	/**
	 *  
	The name of the <code>material</code> property.
	

	 */
	public static final String MaterialPropertyName = "material";
	/**
	 *  
	The name of the <code>outline</code> property.
	

	 */
	public static final String OutlinePropertyName = "outline";
	/**
	 *  
	The name of the <code>outlineColor</code> property.
	

	 */
	public static final String OutlineColorPropertyName = "outlineColor";
	/**
	 *  
	The name of the <code>outlineWidth</code> property.
	

	 */
	public static final String OutlineWidthPropertyName = "outlineWidth";
	/**
	 *  
	The name of the <code>perPositionHeight</code> property.
	

	 */
	public static final String PerPositionHeightPropertyName = "perPositionHeight";
	/**
	 *  
	The name of the <code>closeTop</code> property.
	

	 */
	public static final String CloseTopPropertyName = "closeTop";
	/**
	 *  
	The name of the <code>closeBottom</code> property.
	

	 */
	public static final String CloseBottomPropertyName = "closeBottom";
	private Lazy<BooleanCesiumWriter> m_show = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
		public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowPropertyName);
		}
	}, false);
	private Lazy<PositionListCesiumWriter> m_positions = new Lazy<cesiumlanguagewriter.PositionListCesiumWriter>(new Func1<cesiumlanguagewriter.PositionListCesiumWriter>() {
		public cesiumlanguagewriter.PositionListCesiumWriter invoke() {
			return new PositionListCesiumWriter(PositionsPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_height = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
		public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(HeightPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_extrudedHeight = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
		public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(ExtrudedHeightPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_stRotation = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
		public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(StRotationPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_granularity = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
		public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(GranularityPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_fill = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
		public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(FillPropertyName);
		}
	}, false);
	private Lazy<MaterialCesiumWriter> m_material = new Lazy<cesiumlanguagewriter.MaterialCesiumWriter>(new Func1<cesiumlanguagewriter.MaterialCesiumWriter>() {
		public cesiumlanguagewriter.MaterialCesiumWriter invoke() {
			return new MaterialCesiumWriter(MaterialPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_outline = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
		public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(OutlinePropertyName);
		}
	}, false);
	private Lazy<ColorCesiumWriter> m_outlineColor = new Lazy<cesiumlanguagewriter.ColorCesiumWriter>(new Func1<cesiumlanguagewriter.ColorCesiumWriter>() {
		public cesiumlanguagewriter.ColorCesiumWriter invoke() {
			return new ColorCesiumWriter(OutlineColorPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_outlineWidth = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
		public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(OutlineWidthPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_perPositionHeight = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
		public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(PerPositionHeightPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_closeTop = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
		public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(CloseTopPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_closeBottom = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
		public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(CloseBottomPropertyName);
		}
	}, false);

	/**
	 *  
	Initializes a new instance.
	

	 */
	public PolygonCesiumWriter(String propertyName) {
		super(propertyName);
	}

	/**
	 *  
	Initializes a new instance as a copy of an existing instance.
	
	

	 * @param existingInstance The existing instance to copy.
	 */
	protected PolygonCesiumWriter(PolygonCesiumWriter existingInstance) {
		super(existingInstance);
	}

	@Override
	public PolygonCesiumWriter clone() {
		return new PolygonCesiumWriter(this);
	}

	/**
	 *  Gets the writer for the <code>show</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>show</code> property defines whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter getShowWriter() {
		return m_show.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>show</code> property.  The <code>show</code> property defines whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter openShowProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowWriter());
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>boolean</code> value.  The <code>show</code> property specifies whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The value.
	 */
	public final void writeShowProperty(boolean value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The reference.
	 */
	public final void writeShowPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowPropertyReference(String value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the polygon is shown.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>positions</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>positions</code> property defines the array of positions defining a simple polygon.
	

	 */
	public final PositionListCesiumWriter getPositionsWriter() {
		return m_positions.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>positions</code> property.  The <code>positions</code> property defines the array of positions defining a simple polygon.
	

	 */
	public final PositionListCesiumWriter openPositionsProperty() {
		openIntervalIfNecessary();
		return this.<PositionListCesiumWriter> openAndReturn(getPositionsWriter());
	}

	/**
	 *  
	Writes a value for the <code>positions</code> property as a <code>cartesian</code> value.  The <code>positions</code> property specifies the array of positions defining a simple polygon.
	
	

	 * @param values The values.
	 */
	public final void writePositionsProperty(Iterable<Cartesian> values) {
		{
			cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
			try {
				writer.writeCartesian(values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>positions</code> property as a <code>cartographicRadians</code> value.  The <code>positions</code> property specifies the array of positions defining a simple polygon.
	
	

	 * @param values The values.
	 */
	public final void writePositionsPropertyCartographicRadians(Iterable<Cartographic> values) {
		{
			cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
			try {
				writer.writeCartographicRadians(values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>positions</code> property as a <code>cartographicDegrees</code> value.  The <code>positions</code> property specifies the array of positions defining a simple polygon.
	
	

	 * @param values The values.
	 */
	public final void writePositionsPropertyCartographicDegrees(Iterable<Cartographic> values) {
		{
			cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
			try {
				writer.writeCartographicDegrees(values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>positions</code> property as a <code>references</code> value.  The <code>positions</code> property specifies the array of positions defining a simple polygon.
	
	

	 * @param references The list of references.
	 */
	public final void writePositionsPropertyReferences(Iterable<Reference> references) {
		{
			cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
			try {
				writer.writeReferences(references);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>height</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>height</code> property defines the height of the polygon when `perPositionHeight` is false.
	

	 */
	public final DoubleCesiumWriter getHeightWriter() {
		return m_height.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>height</code> property.  The <code>height</code> property defines the height of the polygon when `perPositionHeight` is false.
	

	 */
	public final DoubleCesiumWriter openHeightProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getHeightWriter());
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>number</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	

	 * @param value The value.
	 */
	public final void writeHeightProperty(double value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>number</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeHeightProperty(List<JulianDate> dates, List<Double> values) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeNumber(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>number</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeHeightProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>reference</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	

	 * @param value The reference.
	 */
	public final void writeHeightPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>reference</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeHeightPropertyReference(String value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>reference</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeHeightPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>height</code> property as a <code>reference</code> value.  The <code>height</code> property specifies the height of the polygon when `perPositionHeight` is false.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeHeightPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>extrudedHeight</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>extrudedHeight</code> property defines the extruded height of the polygon.
	

	 */
	public final DoubleCesiumWriter getExtrudedHeightWriter() {
		return m_extrudedHeight.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>extrudedHeight</code> property.  The <code>extrudedHeight</code> property defines the extruded height of the polygon.
	

	 */
	public final DoubleCesiumWriter openExtrudedHeightProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getExtrudedHeightWriter());
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>number</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	

	 * @param value The value.
	 */
	public final void writeExtrudedHeightProperty(double value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>number</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeExtrudedHeightProperty(List<JulianDate> dates, List<Double> values) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeNumber(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>number</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeExtrudedHeightProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>reference</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	

	 * @param value The reference.
	 */
	public final void writeExtrudedHeightPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>reference</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeExtrudedHeightPropertyReference(String value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>reference</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeExtrudedHeightPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>extrudedHeight</code> property as a <code>reference</code> value.  The <code>extrudedHeight</code> property specifies the extruded height of the polygon.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeExtrudedHeightPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>stRotation</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>stRotation</code> property defines the rotation of any applied texture. A positive rotation is counter-clockwise.
	

	 */
	public final DoubleCesiumWriter getStRotationWriter() {
		return m_stRotation.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>stRotation</code> property.  The <code>stRotation</code> property defines the rotation of any applied texture. A positive rotation is counter-clockwise.
	

	 */
	public final DoubleCesiumWriter openStRotationProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getStRotationWriter());
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>number</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	

	 * @param value The value.
	 */
	public final void writeStRotationProperty(double value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>number</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeStRotationProperty(List<JulianDate> dates, List<Double> values) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeNumber(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>number</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeStRotationProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>reference</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	

	 * @param value The reference.
	 */
	public final void writeStRotationPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>reference</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeStRotationPropertyReference(String value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>reference</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeStRotationPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stRotation</code> property as a <code>reference</code> value.  The <code>stRotation</code> property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeStRotationPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>granularity</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>granularity</code> property defines the sampling distance, in radians.
	

	 */
	public final DoubleCesiumWriter getGranularityWriter() {
		return m_granularity.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>granularity</code> property.  The <code>granularity</code> property defines the sampling distance, in radians.
	

	 */
	public final DoubleCesiumWriter openGranularityProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getGranularityWriter());
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>number</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	

	 * @param value The value.
	 */
	public final void writeGranularityProperty(double value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>number</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeGranularityProperty(List<JulianDate> dates, List<Double> values) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeNumber(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>number</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeGranularityProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>reference</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	

	 * @param value The reference.
	 */
	public final void writeGranularityPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>reference</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeGranularityPropertyReference(String value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>reference</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeGranularityPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>granularity</code> property as a <code>reference</code> value.  The <code>granularity</code> property specifies the sampling distance, in radians.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeGranularityPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>fill</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>fill</code> property defines whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter getFillWriter() {
		return m_fill.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>fill</code> property.  The <code>fill</code> property defines whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter openFillProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getFillWriter());
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>boolean</code> value.  The <code>fill</code> property specifies whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The value.
	 */
	public final void writeFillProperty(boolean value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The reference.
	 */
	public final void writeFillPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeFillPropertyReference(String value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeFillPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the polygon is filled.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeFillPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>material</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>material</code> property defines the material to use to fill the polygon.
	

	 */
	public final MaterialCesiumWriter getMaterialWriter() {
		return m_material.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>material</code> property.  The <code>material</code> property defines the material to use to fill the polygon.
	

	 */
	public final MaterialCesiumWriter openMaterialProperty() {
		openIntervalIfNecessary();
		return this.<MaterialCesiumWriter> openAndReturn(getMaterialWriter());
	}

	/**
	 *  Gets the writer for the <code>outline</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outline</code> property defines whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	

	 */
	public final BooleanCesiumWriter getOutlineWriter() {
		return m_outline.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outline</code> property.  The <code>outline</code> property defines whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	

	 */
	public final BooleanCesiumWriter openOutlineProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getOutlineWriter());
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>boolean</code> value.  The <code>outline</code> property specifies whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	
	

	 * @param value The value.
	 */
	public final void writeOutlineProperty(boolean value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	
	

	 * @param value The reference.
	 */
	public final void writeOutlinePropertyReference(Reference value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOutlinePropertyReference(String value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOutlinePropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the polygon is outlined.  If not specified, the default value is <see langword="false" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOutlinePropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>outlineColor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outlineColor</code> property defines the color of the polygon outline.
	

	 */
	public final ColorCesiumWriter getOutlineColorWriter() {
		return m_outlineColor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outlineColor</code> property.  The <code>outlineColor</code> property defines the color of the polygon outline.
	

	 */
	public final ColorCesiumWriter openOutlineColorProperty() {
		openIntervalIfNecessary();
		return this.<ColorCesiumWriter> openAndReturn(getOutlineColorWriter());
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	

	 * @param color The color.
	 */
	public final void writeOutlineColorProperty(Color color) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(color);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	
	
	

	 * @param red The red component in the range 0 to 255.
	 * @param green The green component in the range 0 to 255.
	 * @param blue The blue component in the range 0 to 255.
	 * @param alpha The alpha component in the range 0 to 255.
	 */
	public final void writeOutlineColorProperty(int red, int green, int blue, int alpha) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(red, green, blue, alpha);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeOutlineColorProperty(List<JulianDate> dates, List<Color> values) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param colors The color corresponding to each date.
	 * @param startIndex The index of the first element to use in the `colors` collection.
	 * @param length The number of elements to use from the `colors` collection.
	 */
	public final void writeOutlineColorProperty(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(dates, colors, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgbaf</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	

	 * @param color The color.
	 */
	public final void writeOutlineColorPropertyRgbaf(Color color) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgbaf(color);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgbaf</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	
	
	

	 * @param red The red component in the range 0 to 1.0.
	 * @param green The green component in the range 0 to 1.0.
	 * @param blue The blue component in the range 0 to 1.0.
	 * @param alpha The alpha component in the range 0 to 1.0.
	 */
	public final void writeOutlineColorPropertyRgbaf(float red, float green, float blue, float alpha) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgbaf(red, green, blue, alpha);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgbaf</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeOutlineColorPropertyRgbaf(List<JulianDate> dates, List<Color> values) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgbaf(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgbaf</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param colors The color corresponding to each date.
	 * @param startIndex The index of the first element to use in the `colors` collection.
	 * @param length The number of elements to use from the `colors` collection.
	 */
	public final void writeOutlineColorPropertyRgbaf(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgbaf(dates, colors, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	

	 * @param value The reference.
	 */
	public final void writeOutlineColorPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOutlineColorPropertyReference(String value) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOutlineColorPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the polygon outline.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOutlineColorPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>outlineWidth</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outlineWidth</code> property defines the width of the polygon outline.  If not specified, the default value is 1.0.
	

	 */
	public final DoubleCesiumWriter getOutlineWidthWriter() {
		return m_outlineWidth.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outlineWidth</code> property.  The <code>outlineWidth</code> property defines the width of the polygon outline.  If not specified, the default value is 1.0.
	

	 */
	public final DoubleCesiumWriter openOutlineWidthProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getOutlineWidthWriter());
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>number</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	

	 * @param value The value.
	 */
	public final void writeOutlineWidthProperty(double value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>number</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeOutlineWidthProperty(List<JulianDate> dates, List<Double> values) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeNumber(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>number</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeOutlineWidthProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	

	 * @param value The reference.
	 */
	public final void writeOutlineWidthPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOutlineWidthPropertyReference(String value) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOutlineWidthPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOutlineWidthPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>perPositionHeight</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>perPositionHeight</code> property defines whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	

	 */
	public final BooleanCesiumWriter getPerPositionHeightWriter() {
		return m_perPositionHeight.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>perPositionHeight</code> property.  The <code>perPositionHeight</code> property defines whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	

	 */
	public final BooleanCesiumWriter openPerPositionHeightProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getPerPositionHeightWriter());
	}

	/**
	 *  
	Writes a value for the <code>perPositionHeight</code> property as a <code>boolean</code> value.  The <code>perPositionHeight</code> property specifies whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	
	

	 * @param value The value.
	 */
	public final void writePerPositionHeightProperty(boolean value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>perPositionHeight</code> property as a <code>reference</code> value.  The <code>perPositionHeight</code> property specifies whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	
	

	 * @param value The reference.
	 */
	public final void writePerPositionHeightPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>perPositionHeight</code> property as a <code>reference</code> value.  The <code>perPositionHeight</code> property specifies whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writePerPositionHeightPropertyReference(String value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>perPositionHeight</code> property as a <code>reference</code> value.  The <code>perPositionHeight</code> property specifies whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writePerPositionHeightPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>perPositionHeight</code> property as a <code>reference</code> value.  The <code>perPositionHeight</code> property specifies whether to use the height of each position to define the polygon or to use `height` as a constant height above the surface.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writePerPositionHeightPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>closeTop</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>closeTop</code> property defines whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter getCloseTopWriter() {
		return m_closeTop.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>closeTop</code> property.  The <code>closeTop</code> property defines whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter openCloseTopProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getCloseTopWriter());
	}

	/**
	 *  
	Writes a value for the <code>closeTop</code> property as a <code>boolean</code> value.  The <code>closeTop</code> property specifies whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The value.
	 */
	public final void writeCloseTopProperty(boolean value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeTop</code> property as a <code>reference</code> value.  The <code>closeTop</code> property specifies whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The reference.
	 */
	public final void writeCloseTopPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeTop</code> property as a <code>reference</code> value.  The <code>closeTop</code> property specifies whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeCloseTopPropertyReference(String value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeTop</code> property as a <code>reference</code> value.  The <code>closeTop</code> property specifies whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeCloseTopPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeTop</code> property as a <code>reference</code> value.  The <code>closeTop</code> property specifies whether to close the top of the polygon.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeCloseTopPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>closeBottom</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>closeBottom</code> property defines whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter getCloseBottomWriter() {
		return m_closeBottom.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>closeBottom</code> property.  The <code>closeBottom</code> property defines whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	

	 */
	public final BooleanCesiumWriter openCloseBottomProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getCloseBottomWriter());
	}

	/**
	 *  
	Writes a value for the <code>closeBottom</code> property as a <code>boolean</code> value.  The <code>closeBottom</code> property specifies whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The value.
	 */
	public final void writeCloseBottomProperty(boolean value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeBottom</code> property as a <code>reference</code> value.  The <code>closeBottom</code> property specifies whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The reference.
	 */
	public final void writeCloseBottomPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeBottom</code> property as a <code>reference</code> value.  The <code>closeBottom</code> property specifies whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeCloseBottomPropertyReference(String value) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeBottom</code> property as a <code>reference</code> value.  The <code>closeBottom</code> property specifies whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeCloseBottomPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>closeBottom</code> property as a <code>reference</code> value.  The <code>closeBottom</code> property specifies whether to close the bottom of the polygon.  If not specified, the default value is <see langword="true" />.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeCloseBottomPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}
}