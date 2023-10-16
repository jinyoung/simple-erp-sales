<template>
    <div>
        <String label="제품 ID" v-model="value.productId" :editMode="editMode"/>
        <Number label="갯수" v-model="value.quantity" :editMode="editMode"/>
        <String label="주문업체 ID" v-model="value.vendorId" :editMode="editMode"/>
        <Money offline label="총 금액" v-model="value.totalAmount" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>

<script>
    import BaseEntity from './base-ui/BaseEntity'

    export default {
        name: 'Order',
        mixins:[BaseEntity],
        components:{
        },
        
        data: () => ({
            path: "orders"
        }),
        created(){
        },
        computed:{
        },
        methods: {
        },
    }
</script>

