<template>
    <div>
        <String label="제품 아이디" v-model="value.productId" :editMode="editMode"/>
        <String label="제품 유형" v-model="value.productType" :editMode="editMode"/>
        <String label="제조사" v-model="value.manufacturer" :editMode="editMode"/>
        <String label="상태" v-model="value.status" :editMode="editMode"/>

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
        name: 'Product',
        mixins:[BaseEntity],
        components:{
        },
        
        data: () => ({
            path: "products"
        }),
        created(){
        },
        computed:{
        },
        methods: {
        },
    }
</script>

