package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.BillboardCesiumWriter;
import cesiumlanguagewriter.BoxCesiumWriter;
import cesiumlanguagewriter.ClockCesiumWriter;
import cesiumlanguagewriter.ConicSensorCesiumWriter;
import cesiumlanguagewriter.CorridorCesiumWriter;
import cesiumlanguagewriter.CustomPatternSensorCesiumWriter;
import cesiumlanguagewriter.CylinderCesiumWriter;
import cesiumlanguagewriter.EllipseCesiumWriter;
import cesiumlanguagewriter.EllipsoidCesiumWriter;
import cesiumlanguagewriter.FanCesiumWriter;
import cesiumlanguagewriter.LabelCesiumWriter;
import cesiumlanguagewriter.ModelCesiumWriter;
import cesiumlanguagewriter.OrientationCesiumWriter;
import cesiumlanguagewriter.PathCesiumWriter;
import cesiumlanguagewriter.PointCesiumWriter;
import cesiumlanguagewriter.PolygonCesiumWriter;
import cesiumlanguagewriter.PolylineCesiumWriter;
import cesiumlanguagewriter.PositionCesiumWriter;
import cesiumlanguagewriter.RectangleCesiumWriter;
import cesiumlanguagewriter.RectangularSensorCesiumWriter;
import cesiumlanguagewriter.StringCesiumWriter;
import cesiumlanguagewriter.VectorCesiumWriter;
import cesiumlanguagewriter.ViewFromCesiumWriter;
import cesiumlanguagewriter.WallCesiumWriter;
import java.util.List;

/**
 *  
 Writes a <code>Packet</code> to a  {@link CesiumOutputStream}.  A <code>Packet</code> is describes the graphical properties of a single object in a scene, such as a single aircraft.
 

 */
public class PacketCesiumWriter extends CesiumElementWriter {
	/**
	 *  
	The name of the <code>id</code> property.
	

	 */
	public static final String IdPropertyName = "id";
	/**
	 *  
	The name of the <code>delete</code> property.
	

	 */
	public static final String DeletePropertyName = "delete";
	/**
	 *  
	The name of the <code>name</code> property.
	

	 */
	public static final String NamePropertyName = "name";
	/**
	 *  
	The name of the <code>parent</code> property.
	

	 */
	public static final String ParentPropertyName = "parent";
	/**
	 *  
	The name of the <code>description</code> property.
	

	 */
	public static final String DescriptionPropertyName = "description";
	/**
	 *  
	The name of the <code>clock</code> property.
	

	 */
	public static final String ClockPropertyName = "clock";
	/**
	 *  
	The name of the <code>version</code> property.
	

	 */
	public static final String VersionPropertyName = "version";
	/**
	 *  
	The name of the <code>availability</code> property.
	

	 */
	public static final String AvailabilityPropertyName = "availability";
	/**
	 *  
	The name of the <code>position</code> property.
	

	 */
	public static final String PositionPropertyName = "position";
	/**
	 *  
	The name of the <code>orientation</code> property.
	

	 */
	public static final String OrientationPropertyName = "orientation";
	/**
	 *  
	The name of the <code>viewFrom</code> property.
	

	 */
	public static final String ViewFromPropertyName = "viewFrom";
	/**
	 *  
	The name of the <code>billboard</code> property.
	

	 */
	public static final String BillboardPropertyName = "billboard";
	/**
	 *  
	The name of the <code>box</code> property.
	

	 */
	public static final String BoxPropertyName = "box";
	/**
	 *  
	The name of the <code>corridor</code> property.
	

	 */
	public static final String CorridorPropertyName = "corridor";
	/**
	 *  
	The name of the <code>cylinder</code> property.
	

	 */
	public static final String CylinderPropertyName = "cylinder";
	/**
	 *  
	The name of the <code>ellipse</code> property.
	

	 */
	public static final String EllipsePropertyName = "ellipse";
	/**
	 *  
	The name of the <code>ellipsoid</code> property.
	

	 */
	public static final String EllipsoidPropertyName = "ellipsoid";
	/**
	 *  
	The name of the <code>label</code> property.
	

	 */
	public static final String LabelPropertyName = "label";
	/**
	 *  
	The name of the <code>model</code> property.
	

	 */
	public static final String ModelPropertyName = "model";
	/**
	 *  
	The name of the <code>path</code> property.
	

	 */
	public static final String PathPropertyName = "path";
	/**
	 *  
	The name of the <code>point</code> property.
	

	 */
	public static final String PointPropertyName = "point";
	/**
	 *  
	The name of the <code>polygon</code> property.
	

	 */
	public static final String PolygonPropertyName = "polygon";
	/**
	 *  
	The name of the <code>polyline</code> property.
	

	 */
	public static final String PolylinePropertyName = "polyline";
	/**
	 *  
	The name of the <code>rectangle</code> property.
	

	 */
	public static final String RectanglePropertyName = "rectangle";
	/**
	 *  
	The name of the <code>wall</code> property.
	

	 */
	public static final String WallPropertyName = "wall";
	/**
	 *  
	The name of the <code>agi_conicSensor</code> property.
	

	 */
	public static final String ConicSensorPropertyName = "agi_conicSensor";
	/**
	 *  
	The name of the <code>agi_customPatternSensor</code> property.
	

	 */
	public static final String CustomPatternSensorPropertyName = "agi_customPatternSensor";
	/**
	 *  
	The name of the <code>agi_rectangularSensor</code> property.
	

	 */
	public static final String RectangularSensorPropertyName = "agi_rectangularSensor";
	/**
	 *  
	The name of the <code>agi_fan</code> property.
	

	 */
	public static final String FanPropertyName = "agi_fan";
	/**
	 *  
	The name of the <code>agi_vector</code> property.
	

	 */
	public static final String VectorPropertyName = "agi_vector";
	private Lazy<StringCesiumWriter> m_description = new Lazy<cesiumlanguagewriter.StringCesiumWriter>(new Func1<cesiumlanguagewriter.StringCesiumWriter>() {
		public cesiumlanguagewriter.StringCesiumWriter invoke() {
			return new StringCesiumWriter(DescriptionPropertyName);
		}
	}, false);
	private Lazy<ClockCesiumWriter> m_clock = new Lazy<cesiumlanguagewriter.ClockCesiumWriter>(new Func1<cesiumlanguagewriter.ClockCesiumWriter>() {
		public cesiumlanguagewriter.ClockCesiumWriter invoke() {
			return new ClockCesiumWriter(ClockPropertyName);
		}
	}, false);
	private Lazy<PositionCesiumWriter> m_position = new Lazy<cesiumlanguagewriter.PositionCesiumWriter>(new Func1<cesiumlanguagewriter.PositionCesiumWriter>() {
		public cesiumlanguagewriter.PositionCesiumWriter invoke() {
			return new PositionCesiumWriter(PositionPropertyName);
		}
	}, false);
	private Lazy<OrientationCesiumWriter> m_orientation = new Lazy<cesiumlanguagewriter.OrientationCesiumWriter>(new Func1<cesiumlanguagewriter.OrientationCesiumWriter>() {
		public cesiumlanguagewriter.OrientationCesiumWriter invoke() {
			return new OrientationCesiumWriter(OrientationPropertyName);
		}
	}, false);
	private Lazy<ViewFromCesiumWriter> m_viewFrom = new Lazy<cesiumlanguagewriter.ViewFromCesiumWriter>(new Func1<cesiumlanguagewriter.ViewFromCesiumWriter>() {
		public cesiumlanguagewriter.ViewFromCesiumWriter invoke() {
			return new ViewFromCesiumWriter(ViewFromPropertyName);
		}
	}, false);
	private Lazy<BillboardCesiumWriter> m_billboard = new Lazy<cesiumlanguagewriter.BillboardCesiumWriter>(new Func1<cesiumlanguagewriter.BillboardCesiumWriter>() {
		public cesiumlanguagewriter.BillboardCesiumWriter invoke() {
			return new BillboardCesiumWriter(BillboardPropertyName);
		}
	}, false);
	private Lazy<BoxCesiumWriter> m_box = new Lazy<cesiumlanguagewriter.BoxCesiumWriter>(new Func1<cesiumlanguagewriter.BoxCesiumWriter>() {
		public cesiumlanguagewriter.BoxCesiumWriter invoke() {
			return new BoxCesiumWriter(BoxPropertyName);
		}
	}, false);
	private Lazy<CorridorCesiumWriter> m_corridor = new Lazy<cesiumlanguagewriter.CorridorCesiumWriter>(new Func1<cesiumlanguagewriter.CorridorCesiumWriter>() {
		public cesiumlanguagewriter.CorridorCesiumWriter invoke() {
			return new CorridorCesiumWriter(CorridorPropertyName);
		}
	}, false);
	private Lazy<CylinderCesiumWriter> m_cylinder = new Lazy<cesiumlanguagewriter.CylinderCesiumWriter>(new Func1<cesiumlanguagewriter.CylinderCesiumWriter>() {
		public cesiumlanguagewriter.CylinderCesiumWriter invoke() {
			return new CylinderCesiumWriter(CylinderPropertyName);
		}
	}, false);
	private Lazy<EllipseCesiumWriter> m_ellipse = new Lazy<cesiumlanguagewriter.EllipseCesiumWriter>(new Func1<cesiumlanguagewriter.EllipseCesiumWriter>() {
		public cesiumlanguagewriter.EllipseCesiumWriter invoke() {
			return new EllipseCesiumWriter(EllipsePropertyName);
		}
	}, false);
	private Lazy<EllipsoidCesiumWriter> m_ellipsoid = new Lazy<cesiumlanguagewriter.EllipsoidCesiumWriter>(new Func1<cesiumlanguagewriter.EllipsoidCesiumWriter>() {
		public cesiumlanguagewriter.EllipsoidCesiumWriter invoke() {
			return new EllipsoidCesiumWriter(EllipsoidPropertyName);
		}
	}, false);
	private Lazy<LabelCesiumWriter> m_label = new Lazy<cesiumlanguagewriter.LabelCesiumWriter>(new Func1<cesiumlanguagewriter.LabelCesiumWriter>() {
		public cesiumlanguagewriter.LabelCesiumWriter invoke() {
			return new LabelCesiumWriter(LabelPropertyName);
		}
	}, false);
	private Lazy<ModelCesiumWriter> m_model = new Lazy<cesiumlanguagewriter.ModelCesiumWriter>(new Func1<cesiumlanguagewriter.ModelCesiumWriter>() {
		public cesiumlanguagewriter.ModelCesiumWriter invoke() {
			return new ModelCesiumWriter(ModelPropertyName);
		}
	}, false);
	private Lazy<PathCesiumWriter> m_path = new Lazy<cesiumlanguagewriter.PathCesiumWriter>(new Func1<cesiumlanguagewriter.PathCesiumWriter>() {
		public cesiumlanguagewriter.PathCesiumWriter invoke() {
			return new PathCesiumWriter(PathPropertyName);
		}
	}, false);
	private Lazy<PointCesiumWriter> m_point = new Lazy<cesiumlanguagewriter.PointCesiumWriter>(new Func1<cesiumlanguagewriter.PointCesiumWriter>() {
		public cesiumlanguagewriter.PointCesiumWriter invoke() {
			return new PointCesiumWriter(PointPropertyName);
		}
	}, false);
	private Lazy<PolygonCesiumWriter> m_polygon = new Lazy<cesiumlanguagewriter.PolygonCesiumWriter>(new Func1<cesiumlanguagewriter.PolygonCesiumWriter>() {
		public cesiumlanguagewriter.PolygonCesiumWriter invoke() {
			return new PolygonCesiumWriter(PolygonPropertyName);
		}
	}, false);
	private Lazy<PolylineCesiumWriter> m_polyline = new Lazy<cesiumlanguagewriter.PolylineCesiumWriter>(new Func1<cesiumlanguagewriter.PolylineCesiumWriter>() {
		public cesiumlanguagewriter.PolylineCesiumWriter invoke() {
			return new PolylineCesiumWriter(PolylinePropertyName);
		}
	}, false);
	private Lazy<RectangleCesiumWriter> m_rectangle = new Lazy<cesiumlanguagewriter.RectangleCesiumWriter>(new Func1<cesiumlanguagewriter.RectangleCesiumWriter>() {
		public cesiumlanguagewriter.RectangleCesiumWriter invoke() {
			return new RectangleCesiumWriter(RectanglePropertyName);
		}
	}, false);
	private Lazy<WallCesiumWriter> m_wall = new Lazy<cesiumlanguagewriter.WallCesiumWriter>(new Func1<cesiumlanguagewriter.WallCesiumWriter>() {
		public cesiumlanguagewriter.WallCesiumWriter invoke() {
			return new WallCesiumWriter(WallPropertyName);
		}
	}, false);
	private Lazy<ConicSensorCesiumWriter> m_agi_conicSensor = new Lazy<cesiumlanguagewriter.ConicSensorCesiumWriter>(new Func1<cesiumlanguagewriter.ConicSensorCesiumWriter>() {
		public cesiumlanguagewriter.ConicSensorCesiumWriter invoke() {
			return new ConicSensorCesiumWriter(ConicSensorPropertyName);
		}
	}, false);
	private Lazy<CustomPatternSensorCesiumWriter> m_agi_customPatternSensor = new Lazy<cesiumlanguagewriter.CustomPatternSensorCesiumWriter>(
			new Func1<cesiumlanguagewriter.CustomPatternSensorCesiumWriter>() {
				public cesiumlanguagewriter.CustomPatternSensorCesiumWriter invoke() {
					return new CustomPatternSensorCesiumWriter(CustomPatternSensorPropertyName);
				}
			}, false);
	private Lazy<RectangularSensorCesiumWriter> m_agi_rectangularSensor = new Lazy<cesiumlanguagewriter.RectangularSensorCesiumWriter>(new Func1<cesiumlanguagewriter.RectangularSensorCesiumWriter>() {
		public cesiumlanguagewriter.RectangularSensorCesiumWriter invoke() {
			return new RectangularSensorCesiumWriter(RectangularSensorPropertyName);
		}
	}, false);
	private Lazy<FanCesiumWriter> m_agi_fan = new Lazy<cesiumlanguagewriter.FanCesiumWriter>(new Func1<cesiumlanguagewriter.FanCesiumWriter>() {
		public cesiumlanguagewriter.FanCesiumWriter invoke() {
			return new FanCesiumWriter(FanPropertyName);
		}
	}, false);
	private Lazy<VectorCesiumWriter> m_agi_vector = new Lazy<cesiumlanguagewriter.VectorCesiumWriter>(new Func1<cesiumlanguagewriter.VectorCesiumWriter>() {
		public cesiumlanguagewriter.VectorCesiumWriter invoke() {
			return new VectorCesiumWriter(VectorPropertyName);
		}
	}, false);

	/**
	 *  
	Writes the start of a new JSON object representing the packet.
	

	 */
	@Override
	protected void onOpen() {
		getOutput().writeStartObject();
	}

	/**
	 *  
	Writes the end of the JSON object representing the packet.
	

	 */
	@Override
	protected void onClose() {
		getOutput().writeEndObject();
	}

	/**
	 *  
	Writes the value expressed as a <code>id</code>, which is the ID of the object described by this packet.  IDs do not need to be GUIDs, but they do need to uniquely identify a single object within a CZML source and any other CZML sources loaded into the same scope.  If this property is not specified, the client will automatically generate a unique one.  However, this prevents later packets from referring to this object in order to add more data to it.
	
	

	 * @param value The value.
	 */
	public final void writeId(String value) {
		String PropertyName = IdPropertyName;
		getOutput().writePropertyName(PropertyName);
		getOutput().writeValue(value);
	}

	/**
	 *  
	Writes the value expressed as a <code>delete</code>, which is whether the client should delete all existing data for this object, identified by ID. If true, all other properties in this packet will be ignored.
	
	

	 * @param value The value.
	 */
	public final void writeDelete(boolean value) {
		String PropertyName = DeletePropertyName;
		getOutput().writePropertyName(PropertyName);
		getOutput().writeValue(value);
	}

	/**
	 *  
	Writes the value expressed as a <code>name</code>, which is the name of the object.  It does not have to be unique and is intended for user consumption.
	
	

	 * @param value The value.
	 */
	public final void writeName(String value) {
		String PropertyName = NamePropertyName;
		getOutput().writePropertyName(PropertyName);
		getOutput().writeValue(value);
	}

	/**
	 *  
	Writes the value expressed as a <code>parent</code>, which is the ID of the parent object, if any.
	
	

	 * @param value The value.
	 */
	public final void writeParent(String value) {
		String PropertyName = ParentPropertyName;
		getOutput().writePropertyName(PropertyName);
		getOutput().writeValue(value);
	}

	/**
	 *  Gets the writer for the <code>description</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>description</code> property defines an HTML description of the object.
	

	 */
	public final StringCesiumWriter getDescriptionWriter() {
		return m_description.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>description</code> property.  The <code>description</code> property defines an HTML description of the object.
	

	 */
	public final StringCesiumWriter openDescriptionProperty() {
		return this.<StringCesiumWriter> openAndReturn(getDescriptionWriter());
	}

	/**
	 *  
	Writes a value for the <code>description</code> property as a <code>string</code> value.  The <code>description</code> property specifies an HTML description of the object.
	
	

	 * @param value The value.
	 */
	public final void writeDescriptionProperty(String value) {
		{
			cesiumlanguagewriter.StringCesiumWriter writer = openDescriptionProperty();
			try {
				writer.writeString(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>description</code> property as a <code>reference</code> value.  The <code>description</code> property specifies an HTML description of the object.
	
	

	 * @param value The reference.
	 */
	public final void writeDescriptionPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.StringCesiumWriter writer = openDescriptionProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>description</code> property as a <code>reference</code> value.  The <code>description</code> property specifies an HTML description of the object.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeDescriptionPropertyReference(String value) {
		{
			cesiumlanguagewriter.StringCesiumWriter writer = openDescriptionProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>description</code> property as a <code>reference</code> value.  The <code>description</code> property specifies an HTML description of the object.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeDescriptionPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.StringCesiumWriter writer = openDescriptionProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>description</code> property as a <code>reference</code> value.  The <code>description</code> property specifies an HTML description of the object.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeDescriptionPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.StringCesiumWriter writer = openDescriptionProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>clock</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>clock</code> property defines the clock settings for the entire data set. Only valid on the document object.
	

	 */
	public final ClockCesiumWriter getClockWriter() {
		return m_clock.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>clock</code> property.  The <code>clock</code> property defines the clock settings for the entire data set. Only valid on the document object.
	

	 */
	public final ClockCesiumWriter openClockProperty() {
		return this.<ClockCesiumWriter> openAndReturn(getClockWriter());
	}

	/**
	 *  
	Writes the value expressed as a <code>version</code>, which is the CZML version being written. Only valid on the document object.
	
	

	 * @param value The value.
	 */
	public final void writeVersion(String value) {
		String PropertyName = VersionPropertyName;
		getOutput().writePropertyName(PropertyName);
		getOutput().writeValue(value);
	}

	/**
	 *  
	Writes the value expressed as a <code>availability</code>, which is the set of time intervals over which data for an object is available. The property can be a single string specifying a single interval, or an array of strings representing intervals.  A later Cesium packet can update this availability if it changes or is found to be incorrect. For example, an SGP4 propagator may initially report availability for all time, but then later the propagator throws an exception and the availability can be adjusted to end at that time. If this optional property is not present, the object is assumed to be available for all time. Availability is scoped to a particular CZML stream, so two different streams can list different availability for a single object. Within a single stream, the last availability stated for an object is the one in effect and any availabilities in previous packets are ignored. If an object is not available at a time, the client will not draw that object.  If not specified, the default value is 0000-00-00T00:00:00Z/9999-12-31T24:00:00Z.
	
	

	 * @param value The interval.
	 */
	public final void writeAvailability(TimeInterval value) {
		String PropertyName = AvailabilityPropertyName;
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeTimeInterval(getOutput(), value);
	}

	/**
	 *  
	Writes the value expressed as a <code>availability</code>, which is the set of time intervals over which data for an object is available. The property can be a single string specifying a single interval, or an array of strings representing intervals.  A later Cesium packet can update this availability if it changes or is found to be incorrect. For example, an SGP4 propagator may initially report availability for all time, but then later the propagator throws an exception and the availability can be adjusted to end at that time. If this optional property is not present, the object is assumed to be available for all time. Availability is scoped to a particular CZML stream, so two different streams can list different availability for a single object. Within a single stream, the last availability stated for an object is the one in effect and any availabilities in previous packets are ignored. If an object is not available at a time, the client will not draw that object.  If not specified, the default value is 0000-00-00T00:00:00Z/9999-12-31T24:00:00Z.
	
	
	

	 * @param start The earliest date of the interval.
	 * @param stop The latest date of the interval.
	 */
	public final void writeAvailability(JulianDate start, JulianDate stop) {
		writeAvailability(new TimeInterval(start, stop));
	}

	/**
	 *  
	Writes the value expressed as a <code>availability</code>, which is the set of time intervals over which data for an object is available. The property can be a single string specifying a single interval, or an array of strings representing intervals.  A later Cesium packet can update this availability if it changes or is found to be incorrect. For example, an SGP4 propagator may initially report availability for all time, but then later the propagator throws an exception and the availability can be adjusted to end at that time. If this optional property is not present, the object is assumed to be available for all time. Availability is scoped to a particular CZML stream, so two different streams can list different availability for a single object. Within a single stream, the last availability stated for an object is the one in effect and any availabilities in previous packets are ignored. If an object is not available at a time, the client will not draw that object.  If not specified, the default value is 0000-00-00T00:00:00Z/9999-12-31T24:00:00Z.
	
	

	 * @param value The intervals.
	 */
	public final void writeAvailability(List<TimeInterval> value) {
		String PropertyName = AvailabilityPropertyName;
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeTimeIntervalCollection(getOutput(), value);
	}

	/**
	 *  Gets the writer for the <code>position</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>position</code> property defines the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	

	 */
	public final PositionCesiumWriter getPositionWriter() {
		return m_position.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>position</code> property.  The <code>position</code> property defines the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	

	 */
	public final PositionCesiumWriter openPositionProperty() {
		return this.<PositionCesiumWriter> openAndReturn(getPositionWriter());
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartesian</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	

	 * @param value The value.
	 */
	public final void writePositionProperty(Cartesian value) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartesian(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartesian</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writePositionProperty(List<JulianDate> dates, List<Cartesian> values) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartesian(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartesian</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writePositionProperty(List<JulianDate> dates, List<Cartesian> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartesian(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartographicRadians</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	

	 * @param value The interval.
	 */
	public final void writePositionPropertyCartographicRadians(Cartographic value) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartographicRadians(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartographicRadians</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writePositionPropertyCartographicRadians(List<JulianDate> dates, List<Cartographic> values) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartographicRadians(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartographicRadians</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The position corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writePositionPropertyCartographicRadians(List<JulianDate> dates, List<Cartographic> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartographicRadians(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartographicDegrees</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	

	 * @param value The interval.
	 */
	public final void writePositionPropertyCartographicDegrees(Cartographic value) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartographicDegrees(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartographicDegrees</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writePositionPropertyCartographicDegrees(List<JulianDate> dates, List<Cartographic> values) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartographicDegrees(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartographicDegrees</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The position corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writePositionPropertyCartographicDegrees(List<JulianDate> dates, List<Cartographic> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartographicDegrees(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartesianVelocity</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	

	 * @param value The value.
	 */
	public final void writePositionPropertyCartesianVelocity(Motion1<Cartesian> value) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartesianVelocity(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartesianVelocity</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writePositionPropertyCartesianVelocity(List<JulianDate> dates, List<Motion1<Cartesian>> values) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartesianVelocity(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>cartesianVelocity</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writePositionPropertyCartesianVelocity(List<JulianDate> dates, List<Motion1<Cartesian>> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeCartesianVelocity(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>reference</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	

	 * @param value The reference.
	 */
	public final void writePositionPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>reference</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writePositionPropertyReference(String value) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>reference</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writePositionPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>position</code> property as a <code>reference</code> value.  The <code>position</code> property specifies the position of the object in the world. The position has no direct visual representation, but it is used to locate billboards, labels, and other graphical items attached to the object.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writePositionPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.PositionCesiumWriter writer = openPositionProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>orientation</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>orientation</code> property defines the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	

	 */
	public final OrientationCesiumWriter getOrientationWriter() {
		return m_orientation.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>orientation</code> property.  The <code>orientation</code> property defines the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	

	 */
	public final OrientationCesiumWriter openOrientationProperty() {
		return this.<OrientationCesiumWriter> openAndReturn(getOrientationWriter());
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>unitQuaternion</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	

	 * @param value The value.
	 */
	public final void writeOrientationProperty(UnitQuaternion value) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeUnitQuaternion(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>unitQuaternion</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> values) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeUnitQuaternion(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>unitQuaternion</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeOrientationProperty(List<JulianDate> dates, List<UnitQuaternion> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeUnitQuaternion(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>reference</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	

	 * @param value The reference.
	 */
	public final void writeOrientationPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>reference</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOrientationPropertyReference(String value) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>reference</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOrientationPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>orientation</code> property as a <code>reference</code> value.  The <code>orientation</code> property specifies the orientation of the object in the world.  The orientation has no direct visual representation, but it is used to orient models, cones, pyramids, and other graphical items attached to the object.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOrientationPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.OrientationCesiumWriter writer = openOrientationProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>viewFrom</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>viewFrom</code> property defines a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	

	 */
	public final ViewFromCesiumWriter getViewFromWriter() {
		return m_viewFrom.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>viewFrom</code> property.  The <code>viewFrom</code> property defines a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	

	 */
	public final ViewFromCesiumWriter openViewFromProperty() {
		return this.<ViewFromCesiumWriter> openAndReturn(getViewFromWriter());
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>cartesian</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	

	 * @param value The value.
	 */
	public final void writeViewFromProperty(Cartesian value) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeCartesian(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>cartesian</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeViewFromProperty(List<JulianDate> dates, List<Cartesian> values) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeCartesian(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>cartesian</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeViewFromProperty(List<JulianDate> dates, List<Cartesian> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeCartesian(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>reference</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	

	 * @param value The reference.
	 */
	public final void writeViewFromPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>reference</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeViewFromPropertyReference(String value) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>reference</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeViewFromPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>viewFrom</code> property as a <code>reference</code> value.  The <code>viewFrom</code> property specifies a suggested camera location when viewing this object.  The property is specified as a Cartesian position in the East (x), North (y), Up (z) reference frame relative to the object's position.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeViewFromPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.ViewFromCesiumWriter writer = openViewFromProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>billboard</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>billboard</code> property defines a billboard, or viewport-aligned image, sometimes called a marker.  The billboard is positioned in the scene by the `position` property.
	

	 */
	public final BillboardCesiumWriter getBillboardWriter() {
		return m_billboard.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>billboard</code> property.  The <code>billboard</code> property defines a billboard, or viewport-aligned image, sometimes called a marker.  The billboard is positioned in the scene by the `position` property.
	

	 */
	public final BillboardCesiumWriter openBillboardProperty() {
		return this.<BillboardCesiumWriter> openAndReturn(getBillboardWriter());
	}

	/**
	 *  Gets the writer for the <code>box</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>box</code> property defines a box, which is a closed rectangular cuboid.  The box is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final BoxCesiumWriter getBoxWriter() {
		return m_box.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>box</code> property.  The <code>box</code> property defines a box, which is a closed rectangular cuboid.  The box is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final BoxCesiumWriter openBoxProperty() {
		return this.<BoxCesiumWriter> openAndReturn(getBoxWriter());
	}

	/**
	 *  Gets the writer for the <code>corridor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>corridor</code> property defines a corridor, which is a shape defined by a centerline and width.
	

	 */
	public final CorridorCesiumWriter getCorridorWriter() {
		return m_corridor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>corridor</code> property.  The <code>corridor</code> property defines a corridor, which is a shape defined by a centerline and width.
	

	 */
	public final CorridorCesiumWriter openCorridorProperty() {
		return this.<CorridorCesiumWriter> openAndReturn(getCorridorWriter());
	}

	/**
	 *  Gets the writer for the <code>cylinder</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>cylinder</code> property defines a cylinder, truncated cone, or cone defined by a length, top radius, and bottom radius.  The cylinder is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final CylinderCesiumWriter getCylinderWriter() {
		return m_cylinder.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>cylinder</code> property.  The <code>cylinder</code> property defines a cylinder, truncated cone, or cone defined by a length, top radius, and bottom radius.  The cylinder is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final CylinderCesiumWriter openCylinderProperty() {
		return this.<CylinderCesiumWriter> openAndReturn(getCylinderWriter());
	}

	/**
	 *  Gets the writer for the <code>ellipse</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>ellipse</code> property defines an ellipse, which is a closed curve on the surface of the Earth.  The ellipse is positioned using the `position` property.
	

	 */
	public final EllipseCesiumWriter getEllipseWriter() {
		return m_ellipse.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>ellipse</code> property.  The <code>ellipse</code> property defines an ellipse, which is a closed curve on the surface of the Earth.  The ellipse is positioned using the `position` property.
	

	 */
	public final EllipseCesiumWriter openEllipseProperty() {
		return this.<EllipseCesiumWriter> openAndReturn(getEllipseWriter());
	}

	/**
	 *  Gets the writer for the <code>ellipsoid</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>ellipsoid</code> property defines an ellipsoid, which is a closed quadric surface that is a three dimensional analogue of an ellipse.  The ellipsoid is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final EllipsoidCesiumWriter getEllipsoidWriter() {
		return m_ellipsoid.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>ellipsoid</code> property.  The <code>ellipsoid</code> property defines an ellipsoid, which is a closed quadric surface that is a three dimensional analogue of an ellipse.  The ellipsoid is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final EllipsoidCesiumWriter openEllipsoidProperty() {
		return this.<EllipsoidCesiumWriter> openAndReturn(getEllipsoidWriter());
	}

	/**
	 *  Gets the writer for the <code>label</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>label</code> property defines a string of text.  The label is positioned in the scene by the `position` property.
	

	 */
	public final LabelCesiumWriter getLabelWriter() {
		return m_label.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>label</code> property.  The <code>label</code> property defines a string of text.  The label is positioned in the scene by the `position` property.
	

	 */
	public final LabelCesiumWriter openLabelProperty() {
		return this.<LabelCesiumWriter> openAndReturn(getLabelWriter());
	}

	/**
	 *  Gets the writer for the <code>model</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>model</code> property defines a 3D model.  The model is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final ModelCesiumWriter getModelWriter() {
		return m_model.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>model</code> property.  The <code>model</code> property defines a 3D model.  The model is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final ModelCesiumWriter openModelProperty() {
		return this.<ModelCesiumWriter> openAndReturn(getModelWriter());
	}

	/**
	 *  Gets the writer for the <code>path</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>path</code> property defines a path, which is a polyline defined by the motion of an object over time.  The possible vertices of the path are specified by the `position` property.
	

	 */
	public final PathCesiumWriter getPathWriter() {
		return m_path.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>path</code> property.  The <code>path</code> property defines a path, which is a polyline defined by the motion of an object over time.  The possible vertices of the path are specified by the `position` property.
	

	 */
	public final PathCesiumWriter openPathProperty() {
		return this.<PathCesiumWriter> openAndReturn(getPathWriter());
	}

	/**
	 *  Gets the writer for the <code>point</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>point</code> property defines a point, or viewport-aligned circle.  The point is positioned in the scene by the `position` property.
	

	 */
	public final PointCesiumWriter getPointWriter() {
		return m_point.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>point</code> property.  The <code>point</code> property defines a point, or viewport-aligned circle.  The point is positioned in the scene by the `position` property.
	

	 */
	public final PointCesiumWriter openPointProperty() {
		return this.<PointCesiumWriter> openAndReturn(getPointWriter());
	}

	/**
	 *  Gets the writer for the <code>polygon</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>polygon</code> property defines a polygon, which is a closed figure on the surface of the Earth.
	

	 */
	public final PolygonCesiumWriter getPolygonWriter() {
		return m_polygon.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>polygon</code> property.  The <code>polygon</code> property defines a polygon, which is a closed figure on the surface of the Earth.
	

	 */
	public final PolygonCesiumWriter openPolygonProperty() {
		return this.<PolygonCesiumWriter> openAndReturn(getPolygonWriter());
	}

	/**
	 *  Gets the writer for the <code>polyline</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>polyline</code> property defines a polyline, which is a line in the scene composed of multiple segments.
	

	 */
	public final PolylineCesiumWriter getPolylineWriter() {
		return m_polyline.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>polyline</code> property.  The <code>polyline</code> property defines a polyline, which is a line in the scene composed of multiple segments.
	

	 */
	public final PolylineCesiumWriter openPolylineProperty() {
		return this.<PolylineCesiumWriter> openAndReturn(getPolylineWriter());
	}

	/**
	 *  Gets the writer for the <code>rectangle</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>rectangle</code> property defines a cartographic rectangle, which conforms to the curvature of the globe and can be placed along the surface or at altitude.
	

	 */
	public final RectangleCesiumWriter getRectangleWriter() {
		return m_rectangle.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>rectangle</code> property.  The <code>rectangle</code> property defines a cartographic rectangle, which conforms to the curvature of the globe and can be placed along the surface or at altitude.
	

	 */
	public final RectangleCesiumWriter openRectangleProperty() {
		return this.<RectangleCesiumWriter> openAndReturn(getRectangleWriter());
	}

	/**
	 *  Gets the writer for the <code>wall</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>wall</code> property defines a two dimensional wall which conforms to the curvature of the globe and can be placed along the surface or at altitude.
	

	 */
	public final WallCesiumWriter getWallWriter() {
		return m_wall.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>wall</code> property.  The <code>wall</code> property defines a two dimensional wall which conforms to the curvature of the globe and can be placed along the surface or at altitude.
	

	 */
	public final WallCesiumWriter openWallProperty() {
		return this.<WallCesiumWriter> openAndReturn(getWallWriter());
	}

	/**
	 *  Gets the writer for the <code>agi_conicSensor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>agi_conicSensor</code> property defines a conical sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.  The sensor is is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final ConicSensorCesiumWriter getConicSensorWriter() {
		return m_agi_conicSensor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>agi_conicSensor</code> property.  The <code>agi_conicSensor</code> property defines a conical sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.  The sensor is is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final ConicSensorCesiumWriter openConicSensorProperty() {
		return this.<ConicSensorCesiumWriter> openAndReturn(getConicSensorWriter());
	}

	/**
	 *  Gets the writer for the <code>agi_customPatternSensor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>agi_customPatternSensor</code> property defines a custom sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.  The sensor is is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final CustomPatternSensorCesiumWriter getCustomPatternSensorWriter() {
		return m_agi_customPatternSensor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>agi_customPatternSensor</code> property.  The <code>agi_customPatternSensor</code> property defines a custom sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.  The sensor is is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final CustomPatternSensorCesiumWriter openCustomPatternSensorProperty() {
		return this.<CustomPatternSensorCesiumWriter> openAndReturn(getCustomPatternSensorWriter());
	}

	/**
	 *  Gets the writer for the <code>agi_rectangularSensor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>agi_rectangularSensor</code> property defines a rectangular pyramid sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.  The sensor is is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final RectangularSensorCesiumWriter getRectangularSensorWriter() {
		return m_agi_rectangularSensor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>agi_rectangularSensor</code> property.  The <code>agi_rectangularSensor</code> property defines a rectangular pyramid sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.  The sensor is is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final RectangularSensorCesiumWriter openRectangularSensorProperty() {
		return this.<RectangularSensorCesiumWriter> openAndReturn(getRectangularSensorWriter());
	}

	/**
	 *  Gets the writer for the <code>agi_fan</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>agi_fan</code> property defines defines a fan, which starts at a point or apex and extends in a specified list of directions from the apex.  Each pair of directions forms a face of the fan extending to the specified radius.  The fan is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final FanCesiumWriter getFanWriter() {
		return m_agi_fan.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>agi_fan</code> property.  The <code>agi_fan</code> property defines defines a fan, which starts at a point or apex and extends in a specified list of directions from the apex.  Each pair of directions forms a face of the fan extending to the specified radius.  The fan is positioned and oriented using the `position` and `orientation` properties.
	

	 */
	public final FanCesiumWriter openFanProperty() {
		return this.<FanCesiumWriter> openAndReturn(getFanWriter());
	}

	/**
	 *  Gets the writer for the <code>agi_vector</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>agi_vector</code> property defines defines a graphical vector that originates at the `position` property and extends in the provided direction for the provided length.  The vector is positioned using the `position` property.
	

	 */
	public final VectorCesiumWriter getVectorWriter() {
		return m_agi_vector.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>agi_vector</code> property.  The <code>agi_vector</code> property defines defines a graphical vector that originates at the `position` property and extends in the provided direction for the provided length.  The vector is positioned using the `position` property.
	

	 */
	public final VectorCesiumWriter openVectorProperty() {
		return this.<VectorCesiumWriter> openAndReturn(getVectorWriter());
	}
}