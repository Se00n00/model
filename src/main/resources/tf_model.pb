
t
model_inputPlaceholder*%
_user_specified_namemodel_input*
dtype0*$
shape:���������dd
�
9sequential_1/conv2d_1/convolution/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
�
0sequential_1/conv2d_1/convolution/ReadVariableOpReadVariableOp9sequential_1/conv2d_1/convolution/ReadVariableOp/resource*
dtype0
�
!sequential_1/conv2d_1/convolutionConv2Dmodel_input0sequential_1/conv2d_1/convolution/ReadVariableOp*
T0*
data_formatNHWC*
	dilations
*
explicit_paddings
 *
paddingVALID*
strides
*
use_cudnn_on_gpu(
�
5sequential_1/conv2d_1/Reshape/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
�
,sequential_1/conv2d_1/Reshape/ReadVariableOpReadVariableOp5sequential_1/conv2d_1/Reshape/ReadVariableOp/resource*
dtype0
`
#sequential_1/conv2d_1/Reshape/shapeConst*
dtype0*%
valueB"             
�
sequential_1/conv2d_1/ReshapeReshape,sequential_1/conv2d_1/Reshape/ReadVariableOp#sequential_1/conv2d_1/Reshape/shape*
T0*
Tshape0
m
sequential_1/conv2d_1/addAddV2!sequential_1/conv2d_1/convolutionsequential_1/conv2d_1/Reshape*
T0
F
sequential_1/conv2d_1/ReluRelusequential_1/conv2d_1/add*
T0
�
&sequential_1/max_pooling2d_1/MaxPool2dMaxPoolsequential_1/conv2d_1/Relu*
T0*
data_formatNHWC*
explicit_paddings
 *
ksize
*
paddingVALID*
strides

�
;sequential_1/conv2d_1_2/convolution/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
�
2sequential_1/conv2d_1_2/convolution/ReadVariableOpReadVariableOp;sequential_1/conv2d_1_2/convolution/ReadVariableOp/resource*
dtype0
�
#sequential_1/conv2d_1_2/convolutionConv2D&sequential_1/max_pooling2d_1/MaxPool2d2sequential_1/conv2d_1_2/convolution/ReadVariableOp*
T0*
data_formatNHWC*
	dilations
*
explicit_paddings
 *
paddingVALID*
strides
*
use_cudnn_on_gpu(
�
7sequential_1/conv2d_1_2/Reshape/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
�
.sequential_1/conv2d_1_2/Reshape/ReadVariableOpReadVariableOp7sequential_1/conv2d_1_2/Reshape/ReadVariableOp/resource*
dtype0
b
%sequential_1/conv2d_1_2/Reshape/shapeConst*
dtype0*%
valueB"         @   
�
sequential_1/conv2d_1_2/ReshapeReshape.sequential_1/conv2d_1_2/Reshape/ReadVariableOp%sequential_1/conv2d_1_2/Reshape/shape*
T0*
Tshape0
s
sequential_1/conv2d_1_2/addAddV2#sequential_1/conv2d_1_2/convolutionsequential_1/conv2d_1_2/Reshape*
T0
J
sequential_1/conv2d_1_2/ReluRelusequential_1/conv2d_1_2/add*
T0
�
(sequential_1/max_pooling2d_1_2/MaxPool2dMaxPoolsequential_1/conv2d_1_2/Relu*
T0*
data_formatNHWC*
explicit_paddings
 *
ksize
*
paddingVALID*
strides

�
;sequential_1/conv2d_2_1/convolution/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
�
2sequential_1/conv2d_2_1/convolution/ReadVariableOpReadVariableOp;sequential_1/conv2d_2_1/convolution/ReadVariableOp/resource*
dtype0
�
#sequential_1/conv2d_2_1/convolutionConv2D(sequential_1/max_pooling2d_1_2/MaxPool2d2sequential_1/conv2d_2_1/convolution/ReadVariableOp*
T0*
data_formatNHWC*
	dilations
*
explicit_paddings
 *
paddingVALID*
strides
*
use_cudnn_on_gpu(
�
7sequential_1/conv2d_2_1/Reshape/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
�
.sequential_1/conv2d_2_1/Reshape/ReadVariableOpReadVariableOp7sequential_1/conv2d_2_1/Reshape/ReadVariableOp/resource*
dtype0
b
%sequential_1/conv2d_2_1/Reshape/shapeConst*
dtype0*%
valueB"         �   
�
sequential_1/conv2d_2_1/ReshapeReshape.sequential_1/conv2d_2_1/Reshape/ReadVariableOp%sequential_1/conv2d_2_1/Reshape/shape*
T0*
Tshape0
s
sequential_1/conv2d_2_1/addAddV2#sequential_1/conv2d_2_1/convolutionsequential_1/conv2d_2_1/Reshape*
T0
J
sequential_1/conv2d_2_1/ReluRelusequential_1/conv2d_2_1/add*
T0
�
(sequential_1/max_pooling2d_2_1/MaxPool2dMaxPoolsequential_1/conv2d_2_1/Relu*
T0*
data_formatNHWC*
explicit_paddings
 *
ksize
*
paddingVALID*
strides

Y
$sequential_1/flatten_1/Reshape/shapeConst*
dtype0*
valueB"���� 2  
�
sequential_1/flatten_1/ReshapeReshape(sequential_1/max_pooling2d_2_1/MaxPool2d$sequential_1/flatten_1/Reshape/shape*
T0*
Tshape0
~
1sequential_1/dense_1/Cast/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
z
(sequential_1/dense_1/Cast/ReadVariableOpReadVariableOp1sequential_1/dense_1/Cast/ReadVariableOp/resource*
dtype0
�
sequential_1/dense_1/MatMulMatMulsequential_1/flatten_1/Reshape(sequential_1/dense_1/Cast/ReadVariableOp*
T0*
grad_a( *
grad_b( *
transpose_a( *
transpose_b( 
}
0sequential_1/dense_1/Add/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
x
'sequential_1/dense_1/Add/ReadVariableOpReadVariableOp0sequential_1/dense_1/Add/ReadVariableOp/resource*
dtype0
p
sequential_1/dense_1/AddAddV2sequential_1/dense_1/MatMul'sequential_1/dense_1/Add/ReadVariableOp*
T0
D
sequential_1/dense_1/ReluRelusequential_1/dense_1/Add*
T0
�
3sequential_1/dense_1_2/Cast/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
~
*sequential_1/dense_1_2/Cast/ReadVariableOpReadVariableOp3sequential_1/dense_1_2/Cast/ReadVariableOp/resource*
dtype0
�
sequential_1/dense_1_2/MatMulMatMulsequential_1/dense_1/Relu*sequential_1/dense_1_2/Cast/ReadVariableOp*
T0*
grad_a( *
grad_b( *
transpose_a( *
transpose_b( 

2sequential_1/dense_1_2/Add/ReadVariableOp/resourcePlaceholder*"
_user_specified_name
resource*
dtype0*
shape: 
|
)sequential_1/dense_1_2/Add/ReadVariableOpReadVariableOp2sequential_1/dense_1_2/Add/ReadVariableOp/resource*
dtype0
v
sequential_1/dense_1_2/AddAddV2sequential_1/dense_1_2/MatMul)sequential_1/dense_1_2/Add/ReadVariableOp*
T0
N
sequential_1/dense_1_2/SoftmaxSoftmaxsequential_1/dense_1_2/Add*
T0
D
IdentityIdentitysequential_1/dense_1_2/Softmax^NoOp*
T0
�
NoOpNoOp-^sequential_1/conv2d_1/Reshape/ReadVariableOp1^sequential_1/conv2d_1/convolution/ReadVariableOp/^sequential_1/conv2d_1_2/Reshape/ReadVariableOp3^sequential_1/conv2d_1_2/convolution/ReadVariableOp/^sequential_1/conv2d_2_1/Reshape/ReadVariableOp3^sequential_1/conv2d_2_1/convolution/ReadVariableOp(^sequential_1/dense_1/Add/ReadVariableOp)^sequential_1/dense_1/Cast/ReadVariableOp*^sequential_1/dense_1_2/Add/ReadVariableOp+^sequential_1/dense_1_2/Cast/ReadVariableOp"�