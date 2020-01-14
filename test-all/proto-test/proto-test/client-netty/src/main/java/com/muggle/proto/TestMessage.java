// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/proto/test.proto

package com.muggle.proto;

public final class TestMessage {
  private TestMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BookOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Book)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string author = 1;</code>
     */
    boolean hasAuthor();
    /**
     * <code>required string author = 1;</code>
     */
    String getAuthor();
    /**
     * <code>required string author = 1;</code>
     */
    com.google.protobuf.ByteString
        getAuthorBytes();

    /**
     * <code>optional int32 page = 2;</code>
     */
    boolean hasPage();
    /**
     * <code>optional int32 page = 2;</code>
     */
    int getPage();
  }
  /**
   * Protobuf type {@code Book}
   */
  public  static final class Book extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Book)
      BookOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Book.newBuilder() to construct.
    private Book(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Book() {
      author_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Book(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              author_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              page_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TestMessage.internal_static_Book_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TestMessage.internal_static_Book_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Book.class, Builder.class);
    }

    private int bitField0_;
    public static final int AUTHOR_FIELD_NUMBER = 1;
    private volatile Object author_;
    /**
     * <code>required string author = 1;</code>
     */
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string author = 1;</code>
     */
    public String getAuthor() {
      Object ref = author_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          author_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string author = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAuthorBytes() {
      Object ref = author_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        author_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAGE_FIELD_NUMBER = 2;
    private int page_;
    /**
     * <code>optional int32 page = 2;</code>
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 page = 2;</code>
     */
    public int getPage() {
      return page_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAuthor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, author_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, page_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, author_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, page_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Book)) {
        return super.equals(obj);
      }
      Book other = (Book) obj;

      if (hasAuthor() != other.hasAuthor()) return false;
      if (hasAuthor()) {
        if (!getAuthor()
            .equals(other.getAuthor())) return false;
      }
      if (hasPage() != other.hasPage()) return false;
      if (hasPage()) {
        if (getPage()
            != other.getPage()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAuthor()) {
        hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
        hash = (53 * hash) + getAuthor().hashCode();
      }
      if (hasPage()) {
        hash = (37 * hash) + PAGE_FIELD_NUMBER;
        hash = (53 * hash) + getPage();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Book parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Book parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Book parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Book parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Book parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Book parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Book parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Book parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Book parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Book parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Book parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Book parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Book prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Book}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Book)
        BookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TestMessage.internal_static_Book_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TestMessage.internal_static_Book_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Book.class, Builder.class);
      }

      // Construct using com.muggle.proto.TestMessage.Book.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        author_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        page_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TestMessage.internal_static_Book_descriptor;
      }

      @Override
      public Book getDefaultInstanceForType() {
        return Book.getDefaultInstance();
      }

      @Override
      public Book build() {
        Book result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Book buildPartial() {
        Book result = new Book(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.author_ = author_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.page_ = page_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Book) {
          return mergeFrom((Book)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Book other) {
        if (other == Book.getDefaultInstance()) return this;
        if (other.hasAuthor()) {
          bitField0_ |= 0x00000001;
          author_ = other.author_;
          onChanged();
        }
        if (other.hasPage()) {
          setPage(other.getPage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasAuthor()) {
          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Book parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Book) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object author_ = "";
      /**
       * <code>required string author = 1;</code>
       */
      public boolean hasAuthor() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string author = 1;</code>
       */
      public String getAuthor() {
        Object ref = author_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            author_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string author = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAuthorBytes() {
        Object ref = author_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          author_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string author = 1;</code>
       */
      public Builder setAuthor(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        author_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string author = 1;</code>
       */
      public Builder clearAuthor() {
        bitField0_ = (bitField0_ & ~0x00000001);
        author_ = getDefaultInstance().getAuthor();
        onChanged();
        return this;
      }
      /**
       * <code>required string author = 1;</code>
       */
      public Builder setAuthorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        author_ = value;
        onChanged();
        return this;
      }

      private int page_ ;
      /**
       * <code>optional int32 page = 2;</code>
       */
      public boolean hasPage() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 page = 2;</code>
       */
      public int getPage() {
        return page_;
      }
      /**
       * <code>optional int32 page = 2;</code>
       */
      public Builder setPage(int value) {
        bitField0_ |= 0x00000002;
        page_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 page = 2;</code>
       */
      public Builder clearPage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        page_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Book)
    }

    // @@protoc_insertion_point(class_scope:Book)
    private static final Book DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Book();
    }

    public static Book getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<Book>
        PARSER = new com.google.protobuf.AbstractParser<Book>() {
      @Override
      public Book parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Book(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Book> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Book> getParserForType() {
      return PARSER;
    }

    @Override
    public Book getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Book_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Book_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n#src/main/resources/proto/test.proto\"$\n" +
      "\004Book\022\016\n\006author\030\001 \002(\t\022\014\n\004page\030\002 \001(\005B\037\n\020c" +
      "om.muggle.protoB\013TestMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Book_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Book_descriptor,
        new String[] { "Author", "Page", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}