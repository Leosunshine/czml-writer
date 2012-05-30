// This file was generated automatically by GenerateFromSchema.  Do NOT edit it.
// https://github.com/AnalyticalGraphicsInc/czml-writer

using CesiumLanguageWriter.Advanced;
using System;

namespace CesiumLanguageWriter
{
    /// <summary>
    /// Writes a <code>Cone</code> to a <see cref="CesiumOutputStream" />.  A <code>Cone</code> tODO
    /// </summary>
    public class ConeCesiumWriter : CesiumPropertyWriter<ConeCesiumWriter>
    {
        /// <summary>
        /// Initializes a new instance.
        /// </summary>
        public ConeCesiumWriter(string propertyName)
            : base(propertyName)
        {
        }

        /// <summary>
        /// Initializes a new instance as a copy of an existing instance.
        /// </summary>
        /// <param name="existingInstance">The existing instance to copy.</param> 
        protected ConeCesiumWriter(ConeCesiumWriter existingInstance)
            : base(existingInstance)
        {
        }

        /// <inheritdoc />
        public override ConeCesiumWriter Clone()
        {
            return new ConeCesiumWriter(this);
        }

    }
}
