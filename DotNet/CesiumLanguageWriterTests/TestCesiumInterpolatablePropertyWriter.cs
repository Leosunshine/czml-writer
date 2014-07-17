﻿using CesiumLanguageWriter;
using CesiumLanguageWriter.Advanced;
using NUnit.Framework;

namespace CesiumLanguageWriterTests
{
    public abstract class TestCesiumInterpolatablePropertyWriter<TDerived> : TestCesiumPropertyWriter<TDerived>
        where TDerived : CesiumInterpolatablePropertyWriter<TDerived>
    {
        [Test]
        public void InterpolationAlgorithmValueWritesInterpolationAlgorithmProperty()
        {
            CesiumPropertyWriter<TDerived> property = CreatePropertyWriter("foo");
            property.Open(OutputStream);
            using (TDerived interval = property.OpenInterval())
            {
                interval.WriteInterpolationAlgorithm(CesiumInterpolationAlgorithm.Hermite);
            }
            Assert.AreEqual("{\"foo\":{\"interpolationAlgorithm\":\"HERMITE\"}", StringWriter.ToString());
        }

        [Test]
        public void InterpolationDegreeValueWritesInterpolationDegreeProperty()
        {
            CesiumPropertyWriter<TDerived> property = CreatePropertyWriter("foo");
            property.Open(OutputStream);
            using (TDerived interval = property.OpenInterval())
            {
                interval.WriteInterpolationDegree(3);
            }
            Assert.AreEqual("{\"foo\":{\"interpolationDegree\":3}", StringWriter.ToString());
        }

        [Test]
        public void WritesForwardExtrpolationType()
        {
            CesiumPropertyWriter<TDerived> property = CreatePropertyWriter("foo");
            property.Open(OutputStream);
            using (TDerived interval = property.OpenInterval())
            {
                interval.WriteForwardExtrapolationType(CesiumExtrapolationType.Extrapolate);
            }
            Assert.AreEqual(@"{""foo"":{""forwardExtrapolationType"":""EXTRAPOLATE""}", StringWriter.ToString());
        }

        [Test]
        public void WritesBackwardExtrpolationType()
        {
            CesiumPropertyWriter<TDerived> property = CreatePropertyWriter("foo");
            property.Open(OutputStream);
            using (TDerived interval = property.OpenInterval())
            {
                interval.WriteBackwardExtrapolationType(CesiumExtrapolationType.Extrapolate);
            }
            Assert.AreEqual(@"{""foo"":{""backwardExtrapolationType"":""EXTRAPOLATE""}", StringWriter.ToString());
        }

        [Test]
        public void WritesForwardExtrpolationDuration()
        {
            CesiumPropertyWriter<TDerived> property = CreatePropertyWriter("foo");
            property.Open(OutputStream);
            using (TDerived interval = property.OpenInterval())
            {
                interval.WriteForwardExtrapolationDuration(Duration.FromSeconds(12));
            }
            Assert.AreEqual(@"{""foo"":{""forwardExtrapolationDuration"":12}", StringWriter.ToString());
        }

        [Test]
        public void WritesBackwardExtrpolationDuration()
        {
            CesiumPropertyWriter<TDerived> property = CreatePropertyWriter("foo");
            property.Open(OutputStream);
            using (TDerived interval = property.OpenInterval())
            {
                interval.WriteBackwardExtrapolationDuration(Duration.FromSeconds(12));
            }
            Assert.AreEqual(@"{""foo"":{""backwardExtrapolationDuration"":12}", StringWriter.ToString());
        }
    }
}